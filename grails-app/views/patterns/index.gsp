

<html>
<head>
    <title>Star Pattern</title>
     <asset:stylesheet src="application.css"/>
     <asset:link rel="icon" href="myIcon.png" type="image/x-ico" />
</head>
<body>

     <div class="wrapper">
         <div id="header">
               <div id="logo-div">
                 <asset:image src="myIcon.png" class="myLogo"/> myPatterns
               </div>
               <div id="nav-div">
                  <a href="#">Contact</a>
                  <a href="#">Blog</a>
                  <a href="#">Home</a>
                  
                  
               </div>
         </div>


<%-- pattern code is started  --%>
     <div id="patterns-content">
      
            <g:form controller="Patterns" action="index" class="my-form">
               Enter a Number for pattern: <g:textField name="number" value="${input}" class="my-text-field" />
               <input type="submit" value="Submit" class="my-submit-button" />
            </g:form>

      <div id="patterns">
         <h1>N-Forest Star Pattern</h1>
         <div class="pattern">
            <%= n_Forest %>
         </div>

         <h1>N/2-Forest Star Pattern</h1>
         <div class="pattern">
             <%= half_Forest %>
         </div>

          <h1>Seeding Star Pattern</h1>
         <div class="pattern">
           <%= seeding %>
         </div>

           <h1>Star Triangle Pattern</h1>
         <div class="pattern">
            <%= star_Triangle %>
         </div>

          <h1> Symmetry Pattern</h1>
         <div class="pattern">
           <%=  symmetry_pattern %>
         </div>

          <h1> Star Dimond Pattern</h1>
         <div class="pattern">
            <%=  star_dimond %>
         </div>
      </div>

   </div>
    <footer>
        <div class="footer-content">
            &copy; 2023 mypattern
        </div>
    </footer>
</div>
</body>
</html>