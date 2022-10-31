# Human_Resource_Office
Human_Resource_Officer
Hospital Management System -
This application is a platform for people to find medical resource in different city and
community.  
Encounter represent a visit to the doctor’s office. The vital signs timeline is linked to the encounters. Each Encounter will have a single Vital Sign component.
System requirements -
Java SDK - 17.0+
NetBeans


System Admin -

This user role has the the control to perform CRUD [Create-Read-Update-Delete]operations
    ◦ Patient -
        ‣ Can Create new patients
        ‣ Can View/Update patients
    ◦ Doctor -
        ‣ Can Create new Doctors
        ‣ Can View/Update Doctors
    ◦ Hospital -
        ‣ Can Create new Hospital
        ‣ Can View/Update Hospital
    ◦ Encounters -
        ‣ Can Create new Encounters
        ‣ Can View/Update Encounters


Hospital Admin -

This user role has the the control to perform CRU [Create-Read-Update] operations
    ◦ Patient -
        ‣ Can Create new patients
        ‣ Can View/Update patients
    ◦ Doctor -
        ‣ Can Create new Doctors
        ‣ Can View/Update Doctors
    ◦ Hospital -
        ‣ Can Create new Hospital
        ‣ Can View/Update Hospital
    ◦ Encounters -
        ‣ Can Create new Encounters
        ‣ Can View/Update Encounters


Community Admin -

This user role has the the control to perform CRU [Create-Read-Update] operations
    ◦ City -
        ‣ Can Create new City
        ‣ Can View/Update City
    ◦ Community -
        ‣ Can Create new Community
        ‣ Can View/Update Community
    ◦ House -
        ‣ Can Create new House
        ‣ Can View/Update House

Patient -

This role has the the control to perform CRU [Create-Read-Update] operations
    ◦ Encounter -
        ‣ Can Create new Encounter with Doctors
    ◦ Personal Details -
        ‣ Can View/Update personal details.

Doctor -

This role has the the control to perform CRU [Create-Read-Update] operations
    ◦ Encounter -
        ‣ Can Create new Encounter with Patients
        ‣ Can read, view and update vital signs

##Class Diagram

![ClassDiagram](https://user-images.githubusercontent.com/50568458/198933387-68aee7be-1914-491e-a6bd-c93cbc50fee8.png)


##Sequence Diagram

#System Admin CRUD
![image](https://user-images.githubusercontent.com/50568458/198933565-72c476be-dd0e-4d57-a886-697acf4c9f15.png)

#Read Doctor
![image](https://user-images.githubusercontent.com/50568458/198933812-e97227eb-bdba-4e9a-a2da-3970b2623658.png)

#ReadPersonalEncounter
![image](https://user-images.githubusercontent.com/50568458/198934065-aaeb32cc-ccf9-4bad-a550-57f67a34e7c7.png)

#CreateVitalSigns
![image](https://user-images.githubusercontent.com/50568458/198934176-fe052998-140b-43a0-aa17-afa688531e39.png)

#UpdateVitalSigns
![image](https://user-images.githubusercontent.com/50568458/198934344-8a1c5dee-b0d6-427a-8125-c31b54e3611a.png)

#ViewEncounterPatient
![image](https://user-images.githubusercontent.com/50568458/198934988-088a31dc-c963-4992-ab22-41c32523d5b5.png)

#CreateEncounterDoctor
![image](https://user-images.githubusercontent.com/50568458/198935335-ea408001-e08d-42cd-8040-315e9a3fa4fd.png)

#ReadEncounterDoctor
![image](https://user-images.githubusercontent.com/50568458/198935647-241a1294-d119-460e-b71c-21fd1af3d1c4.png)

#CreateEncounterPatient
![image](https://user-images.githubusercontent.com/50568458/198936037-ac67cf69-f8d0-4769-a584-ae185675cb79.png)

#SystemAdminDoctor-(Create, Update, Delete, View)
![image](https://user-images.githubusercontent.com/50568458/198936453-5091c5dd-fe37-4982-8802-ea9412fee86d.png)
![image](https://user-images.githubusercontent.com/50568458/198936761-8943a81e-7a37-4ea6-89a2-578ce9819bca.png)
![image](https://user-images.githubusercontent.com/50568458/198936877-de1ca8f7-0ad1-4ee3-ace2-ceb59a62dcd2.png)
![image](https://user-images.githubusercontent.com/50568458/198936984-50423678-547c-4bf8-ad64-1a6baea466dd.png)

#Hospital System Admin(CRUD operations)
![image](https://user-images.githubusercontent.com/50568458/198937150-26d2f0ea-1aa9-4cb4-a171-1edfa89c0472.png)
![image](https://user-images.githubusercontent.com/50568458/198937183-fca2dd0a-56e5-4b2e-b644-ef408b81547d.png)
![image](https://user-images.githubusercontent.com/50568458/198937202-0ddf39b0-d852-4a17-a967-75f07aa6be09.png)
![image](https://user-images.githubusercontent.com/50568458/198937225-ee618eee-647a-4e6c-afc8-dd6476ff2eab.png)

#Encounters System Admin CRUD Operations
![image](https://user-images.githubusercontent.com/50568458/198937275-c1d485c3-358b-4f7b-8f53-79805e725791.png)
![image](https://user-images.githubusercontent.com/50568458/198937358-f16199b4-45ce-48e5-98d2-38f3c33313f9.png)
![image](https://user-images.githubusercontent.com/50568458/198937403-fcc92d15-1891-4b88-941a-e9ef90ff6f0c.png)
![image](https://user-images.githubusercontent.com/50568458/198937426-b644fc2b-8c67-4d63-b9cd-f04434e614e6.png)

















