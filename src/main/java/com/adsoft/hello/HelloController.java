package com.adsoft.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.antlr.v4.runtime.*;
@RestController
public class HelloController {
   @GetMapping("/")
   public String index() {
       HelloLexer lexer = new HelloLexer(CharStreams.fromString("hello ADsoft"));
       CommonTokenStream tokens = new CommonTokenStream(lexer);
       HelloParser parser = new HelloParser(tokens);
       return "Hello  : " + parser.r().toStringTree();
   }

}
