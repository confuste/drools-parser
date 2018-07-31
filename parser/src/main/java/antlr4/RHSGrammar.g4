grammar RHSGrammar;

options {
  language = Java;
}

@parser::header {
    import java.util.List;
    import java.util.ArrayList;
}

@parser::members {
    private ArrayList<String> variableNames = new ArrayList<String>();

    private boolean variableDefined(String name){
        return variableNames.contains(name);
    }

    private void defineVariable(String name){
        variableNames.add(name);
    }

    public List<String> getAllVariables(){
        return variableNames;
    }

    public int getSize(){
        return variableNames.size();
    }
}



//principal: main main;
//main locals [List<String> symbols = new ArrayList<String>()]
//	: 'Hallo ' name '!'   { System.out.println("variable="+$name.text);
//                            $main::symbols.add($name.text);
//                            defineVariable($name.text);
//                            System.out.println("variables size="+getSize());
//
//                            }; //{System.out.println("var "+$name.text);};
//name: ANY+;
// ANY: .;

//pajaro: 'pajaro' principal  EOF ; // EOF will require parsing the entire input { System.out.println("pajaro");};
//principal: main main { System.out.println("principal");};
//main: 'Hallo ' name '!' { System.out.println("variable="+$name.text);};
//name: ANY+;
//ANY: [a-zA-Z]+;
//WS : [ \t\r\n]+ -> skip ;

init: main*  ;

main
    //: print
    : operation {System.out.println("main");}
    ;

//print
//    : system_print {System.out.println("print");};

operation
    : (operation_update | operation_insert)
    ;

operation_update
    : update_object LPARENT variable RPARENT LCURLY_BRACKET text RCURLY_BRACKET END_LINE {System.out.println($update_object.text+"="+$variable.text);
                                                                                                        defineVariable($update_object.text+"="+$variable.text);}
    ;

operation_insert
    : 'insertLogical' LPARENT 'new' text LPARENT text? (insert_object  text?)+ RPARENT RPARENT END_LINE
    ;


update_object
    : MODIFY
    | REMOVE
    ;

insert_object
    : variable {System.out.println("insert="+$variable.text);
                defineVariable("insert="+$variable.text);}
    ;


//system_print
//    : 'System.out.println' inside_system_print END_LINE {System.out.println("system_print");};

//inside_system_print
//    : LPARENT  inside_system_print_posibilities+ RPARENT {System.out.println("inside_system_print");};

//inside_system_print_posibilities
//     : text
//     | LPARENT RPARENT
//     | inside_system_print {System.out.println("inside_system_print_posibilities");};



variable
    : VARIABLE {System.out.println("variable");};
text
    : ANY+ {System.out.println("text");};

LCURLY_BRACKET: '{' {System.out.println("LCURLY_BRACKET");};
RCURLY_BRACKET: '}' {System.out.println("RCURLY_BRACKET");};
WS : [ \t\r\n]+ -> channel(HIDDEN);
LPARENT : '(' {System.out.println("LPARENT");};
RPARENT: ')' {System.out.println("RPARENT");};
END_LINE: ';';
//COMMA: ',' {System.out.println("COMMA");};
ANY: .;
VARIABLE: '$'[a-zA-Z_]+;
MODIFY: 'modify';
REMOVE: 'remove';
NEWLINE: '\r'? '\n' ;


PRINT_BLOCK
    : 'System.out.println'WS*'('.*?')'WS*';'WS* -> channel(HIDDEN)
    ;

BLOCK_COMMENT
	: '/*' .*? '*/' -> channel(HIDDEN)
	;

LINE_COMMENT
	: '//' ~[\r\n]* -> channel(HIDDEN)
	;
