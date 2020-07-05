# PlaySafeAssessment

# Application RESTful endpoints and examples on how to use them (Part 1)

I decided to use http Request params as opposed to RequestBody or http headers. The method type / http verb for all endpoints is: `GET`

http://${host}:${port}/${application-context}/${endpoint}

This application will listen port `8081`

- http://localhost:8081/conversions/ktoc?kelvin=4
  returns `-269.15` Celsius

- http://localhost:8081/conversions/ctok?celsius=40
  returns `313.15` Kelvin
  
 - http://localhost:8081/conversions/mtok?miles=7
   returns `11.265408` Kilometers
   
 - http://localhost:8081/conversions/ktom?kilometers=14
   returns `8.699196691322674` Miles
   

# Unit Tests

Run in project directory, the command ``mvn test``


# Java Developer Expertise Test (60 min) 

# Part 1 

Create a Github account on github https://github.com/ or use your existing account if you already have one. 

Create a public repository for this project. Create an initial commit with the expertise test outline (this document) in the `readme.md` Create frequent commits of your code. (at least 1 commit every 15 min) 

Create a service capable of serving the following endpoints: For all of the below endpoints a log entry needs to be created for their execution duration. 

# /conversions/ktoc 
The ktoc endpoint should produce an output amount in celsius when given an input amount in kelvin. 

# /conversions/ctok 
The ctok endpoint should produce an output amount in kelvin when given an input amount in celsius. 

# /conversions/mtok 
The mtok endpoint should produce, when given an input amount in miles, an output amount in kilometers. 

# /conversions/ktom 
The ktom endpoint should produce, when given an input amount in kilometers, an output amount in miles. 

# Part 2 – Console Roulette 
See the attached pdf file.
