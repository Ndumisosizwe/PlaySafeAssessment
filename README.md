# PlaySafeAssessment

# Application RESTful endpoints and examples on how to use them

I decided to use http Request params as opposed to RequestBody or http headers. The method type for all endpoints is `GET`

- http://{host}:{port}/conversions/ktoc?amountInKelvin=4
  returns `-269.15` Celsius

- http://{host}:{port}/conversions/ctok?amountInCelsius=40
  returns `313.15` Kelvin
  
 - http://{host}:{port}/conversions/mtok?amountInMiles=7
   returns `11.265408` Kilometers
   
 - http://{host}:{port}/conversions/ktom?amountInKilometers=14
   returns `8.699196691322674` Miles


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
