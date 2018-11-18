/**
 * 
 */
package com.app.spring.aspectj.aj;

/**
 * @author Sandeep
 *
 */
public aspect AspectAJ {

    before() : set(* AccountModel.*) {
        System.out.println("Aspect J Weaving by Before!!");
    }

    pointcut logModel() : call(* AccountModel.trim(String));

    before() : logModel() {
        System.out.println("Aspect J Weaving by Before logModel@@!!");
    }

    pointcut logStudent() : call(* AccountModel.getName());

    after() returning() : logStudent() {
        System.out.println("**@@ After Student Advice @@ !!");
    }
}
