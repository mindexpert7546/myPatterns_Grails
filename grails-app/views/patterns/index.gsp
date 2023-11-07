

<html>
<head>
    <title>Star Pattern</title>
</head>
<body>

    <g:form controller="Patterns" action="index">
        Enter a Number: <g:textField name="number" value="${input}" />
        <input type="submit" value="Submit" />
    </g:form>

    <div>
       <h1>N-Forest Star Pattern</h1>
       <%= n_Forest %>
    </div>

     <div>
       <h1>N/2-Forest Star Pattern</h1>
       <%= half_Forest %>
    </div>

     <div>
       <h1>Seeding Star Pattern</h1>
       <%= seeding %>
    </div>

     <div>
       <h1>Star Triangle Pattern</h1>
       <%= star_Triangle %>
    </div>
     <div>
       <h1> Symmetry Pattern</h1>
       <%=  symmetry_pattern %>
    </div>


      <div>
       <h1> Star Dimond Pattern</h1>
       <%=  star_dimond %>
    </div>
   
</body>
</html>