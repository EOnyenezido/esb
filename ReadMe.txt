Sample SPF, MPFS, MPFA orchestration using Apache Camel, Apache AMQ, Apache CXF
==========================

To build this project use

    mvn install

To run this project from within Maven use

    mvn camel:run

To deploy an instance of this project run

    mvn package
    
to generate WAR files and deploy on a servlet application of your choice

==========================

A sample is deployed on AWS on the url
    http://18.218.49.58:8080/
    
Web console is available at the url
    http://18.218.49.58:8080/
    
SOAP tests are available in the directory
    /src/tests/soapui
===========================

To test the demo application

1. Load the SOAP projects in the directory /src/tests/soapui
2. Open the SPF_US/DS project and test the balance enquiry operation "QueryBalance". The ESB will call the mock billing system to obtain a mock balance. You should get a successful response from the downstream CBS application with a mock balance.
3. Open the MPFS_US instance and test the SIM SWAP operation "ChangeSubIdentity". The ESB will call three downstream systems concurrently - the provisioning system "TOPENG" to delete the old MSISDN, TOPENG again to add the new MSISDN and then the billing system "CBS" to activate the new MSISDN. The responses will be collated and returned as one response. The downstream system mock services acting as CBS and TOPENG have been designed to fail randomly to display error handling.
4. Open the MPFA_US instance and test the Product Purchase operation "ChangeAppendantProduct". This operation flow is asynchronous, a request is received and an acknowledgement is sent immediately. The ESB then calls two downstream systems CBS and TOPENG in sequence with a rollback if the transaction fails. At the end the system will generate a callback message and send to the callback endpoint.
