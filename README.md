INTERNAL
HSBC Global Commercial Banking
Skills Assessment – Java Developer
Introduction
The purpose of this assessment is to gain an idea of a potential candidate’s technical acumen in the context of the role they are applying for. No confidential information about the bank exists in this assessment. It is based on an external use case that broadly represent some types of services that are developed in the bank.
Instructions to the candidate
1. Please read the use case below carefully
2. Having read the use case, please create a space on a public code repository of your choice (e.g. github.com, Bitbucket etc.)
3. Implement the use case in Java code that conforms to a micro-services architecture model using a micro-service container of your choice (SpringBoot is preferred, but others are acceptable)
4. Check your code into the repository space you chose as part of Step 2 above
5. Notify the person who gave you this assessment that you have completed it and provide them with details of how the code can be accessed. Make sure that the checked-in code in the repository is readable by others, but can only be written to by yourself
The Use Case
Exchange Rates
The Rates API is a free service for current and historical foreign exchange rates. It gives historical and current exchange rates for different currencies against the Euro.
You must create a simple web application using the API and data sources at https://ratesapi.io/documentation/ that fulfils the user story below. The web service must:
 Expose REST end-points
 Exposes a Swagger or RAML specification alongside their end-points
 Be secured with basic auth (e.g. a simple “admin/admin” username/password combination)
 Use an in-memory database as a data store where applicable
User Story
Narrative
As a User
I want to be able to see the current and historical exchange rates for the past six months for Pound Sterling (GBP), the US Dollar (USD) and the Hong Kong Dollar (HKD) against the Euro (EUR)
INTERNAL
So that I can use the exchange rate for financial reasons
Elaboration
Example Breakdown
Currency
Month 1
Month 2
Month 3
Month 4
Month 5
Month 6
GBP
<rate>
<rate>
<rate>
<rate>
<rate>
<rate>
USA
<rate>
<rate>
<rate>
<rate>
<rate>
<rate>
UK
<rate>
<rate>
<rate>
<rate>
<rate>
<rate>
Guidelines to the developer
The code and design should meet the requirements and should consider future extensions or maintenance.
The code should be well-structured, commented, have error handling and include a suitable selection of unit and integration tests.
The aim is to assess your problem solving approach, your ability to turn your solution into working code and the way in which you structure code.
Good coding practices needs to be followed and will be assessed based on SOLID (https://en.wikipedia.org/wiki/SOLID) principles.
Acceptance Criteria
S.No Given When Then
1
User wants to check today’s exchange rates for UK, USA and HK against Euro.
User opens a browser and enters the url to access the web application.
A page should display the exchange rates in a tabular form.
2
As above
As above
The page displayed should also have a button which when clicked should take to the next page.
3
As above
As above and if the application has encountered an error
A user friendly error message should be displayed on the web page
4
User wants to get historical exchange rates for UK, USA and HK against Euro for the past six months for the same day.
User clicks on the button provided on the above page.
A new page should display the historical exchange rates in a tabular form as shown in Example breakdown below
5
As above
As above and if the application has encountered an error
A user friendly error message should be displayed on the web page
INTERNAL