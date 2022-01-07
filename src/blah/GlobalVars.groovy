#!/usr/bin/env groovy
package blah

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import blah.GlobalVars
   // println GlobalVars.foo
}