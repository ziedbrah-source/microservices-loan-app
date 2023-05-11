# Loan Management Module

We are (a team of 3) asked in lab for a Software architecture course at INSAT to build a loan management module of an existing banking application in order to automate the following steps of a loan process:

1. The client fills in the application form and uploads the list of required documents.
2. The loan application is first processed by the commercial service, whose task is to check the eligibility of the borrower and the repayment terms and period, based on the borrower’s income and financial situation. An initial scoring is established to assess the eligibility of the client to get the loan.
3. Once done, the client application is then processed by the risk management service in order to make sure that the suggested debt ratio is sufficient enough to maintain a healthy bank account balance for the borrower and that the loan can still be repaid in full as scheduled. This service also has access to the central bank database in order to assess if there are other outstanding commitments with other banks and that have not been paid. The output of this service is a final score which dictates if the borrower’s request should be approved or not.
4. The client is then notified whether his application for a loan has been approved (in principle) or not.
5. Next, the final step will be established by the credit service that elaborates the credit agreement to be signed and the amortization table. Both documents can be later viewed/downloaded by the client.
## Tech used
  - ReactJs
  - Spring boot and other libraries :)
## Architecture

The loan management module is built using a microservice architecture.

- Client Application Service: Provides APIs for the client to fill in the application form and upload the required documents.
- Database Server: Stores the docs of the requester + the credit files if request approved.
- CreditShower Service: Returns the credit files for the user.
- OCR Service: extracts data from the docs sent by the requester.
- Commercial Service: Checks the eligibility of the borrower and the repayment terms and period, based on the borrower’s income and financial situation.
- Risk Management Service: Ensures that the suggested debt ratio is sufficient enough to maintain a healthy bank account balance for the borrower and that the loan can still be repaid in full as scheduled. This service also checks the central bank database for any other outstanding commitments with other banks and that have not been paid.
- Bank Data Acess Service: Implements all needed requests to banks for other services.
- Notification Service: Sends approval or rejection notification to the requester.
- Credit Service: Establishes the credit agreement to be signed and the amortization table and returns it to the client application service.
### Some technical stuff
  An API Gateway has been implemented to manage and route traffic between the services. The API Gateway provides the following benefits:

- Rate limiting: Prevents clients from overwhelming the services with too many requests.
- Load balancing: Distributes traffic evenly across multiple instances of the same service to avoid overloading a single instance (the Client application Service).
- High availability: The Client Service can be multiplied for high availability and to avoid a single point of failure.
- Caching: An API Gateway can cache frequently accessed data, reducing the need for redundant requests to the backend services.

  We also used private and public subnets to improve the security by preventing direct access from the internet which reduces the attack surface of our system.
  
  ##### PS: Bank Data Acess Service talks to a service outside the net but it's in a private subnet, so we put a NAT in the public subnet and we use it to link this service to the net.
  
![Loan Management Module Architecture](https://i.ibb.co/DLf1pbB/Screenshot-from-2023-05-01-01-38-36.png)

## DEMO
[DEMO](https://youtu.be/r0C9mNViaIQ "DEMO")

## Frontend

The loan management module has a frontend application built using React. The frontend provides the following features:

- Form for the client to fill in the loan application.
- File upload functionality for the required documents.
- Notifications for the client when their loan application is approved or denied.
- View and download functionality for the credit agreement and amortization table.

## Conclusion

The loan management module is built using a microservice architecture and an API Gateway for managing and routing traffic between the services. The use of OCR capabilities ensures a faster and more efficient loan application process. The frontend application built using React provides an intuitive and easy-to-use interface for the client.
