package com.pattern

class PatternsController {
    def input 
    def index() {
        if (params.number) {
        try {
            input = params.number.toInteger()
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            render "Invalid input. Please enter a valid number."
            return
        }
        } 
        else {
            input = 5 // Set a default value of 5
        }


        def n_Forest = generaten_Forest(input)
        def half_Forest = generaten_halfForest(input)
        def seeding = generaten_Seeding(input)
        def star_Triangle = generaten_Star_Triangle(input)
        def symmetry_pattern = generaten_Symmetry(input)
        def star_dimond = generaten_Star_Diamond(input)
    
        [n_Forest: n_Forest, half_Forest:half_Forest,seeding:seeding,star_Triangle:star_Triangle,symmetry_pattern:symmetry_pattern,star_dimond:star_dimond]
    }

//First pattern for Forest pattern
    def generaten_Forest(input) {
        def pattern = ""
        for (int i in 1..input) {
            for (int j in 1..input) {
                pattern += "*"
            }
            pattern += "<br/>" 
        }
        return pattern
    }

//Second Pattern for HalfForest pattern
    def generaten_halfForest(input){
        def pattern = ""
        for(int i in 1..input){
            for(int j in 1..i){
              pattern+="*"
            }
            pattern +="<br/>"
        }

        return pattern 
    }

//Third Pattern for Seeding pattern  
     def generaten_Seeding(input){
        def pattern = ""
        int st = input;
         for(int i in 1..input){
             for(int j in 1..st){
                 pattern+="*"
             }
             pattern+="<br/>"
             st--;
         }
        return pattern 
    }


//Fourth Pattern for Star Triangle Pattern
     def generaten_Star_Triangle(input){
       def pattern = ""
       int sp = input-1;
       int st = 1;

        for(int i in 1..input){
          
          //loop for space
           for(int j in 1..sp+1){
              pattern+="&nbsp;&nbsp;"
           }

           //loop for star
           for(int j in 1..st){
              pattern+="*"
           }

           pattern+="<br/>"
            sp--;
            st=st+2;

        }
        return pattern 
    }

//Fifth Pattern for Symmetry Pattern
     def generaten_Symmetry(input){
       def pattern = ""
       int st = 1;
       int sp = input*2-2;
        
        for(int i in 1..input*2-1){
         
         //for first column star
         for(int j in 1..st){
             pattern+="*"
         }
         
         //for second column space 
         for(int j=1; j<=sp; j++){
             pattern+="&nbsp;&nbsp;"
         }
         
         //for third column star
         for(int j in 1..st){
             pattern+="*"
         }
           if(i<input){
               st++;
               sp=sp-2;
           }
           else if(i>=input){
               st--;
               sp=sp+2;
           }
           
          pattern+="<br/>"
        }
        return pattern 
    }

//sixth Pattern for Symmetry Pattern
     def generaten_Star_Diamond(input){
       def pattern = ""
        int sp = input-1;
        int st = 1;

        for(int i in 1..input*2){
            for(int j=1; j<=sp; j++){
                pattern+="&nbsp;&nbsp;"
            }

            for(int j in 1..st){
                pattern+="*"
            }

            pattern+="<br/>"

            if(i<input){
                sp--;
                st=st+2;
            }
            else if(i>input){
                sp++;
                st=st-2;
            }
        }
        return pattern 
    }

}
