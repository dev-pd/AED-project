
package userInterface.common;

import business.EcoSystem;
import business.common.*;
import business.enterprisepkg.*;
import business.networkpkg.Network;
import business.organizationpkg.*;
import business.personpkg.*;
import business.rolepkg.*;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.DoctorWorkRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//this is the RegisterNurseWorkAreaJPanel
public class RegisterNurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private EcoSystem ecoSystem; 
    private Enterprise enterprise;
    private Organization organization;
    public RegisterNurseWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
       this.ecoSystem = ecoSystem;
       
       nursePane.setVisible(true);
         
        addInputVerifiers();
        
        populateCountryComboBox();
        populateNetworkComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        stateCmb = new javax.swing.JComboBox();
        lastNameTxt = new javax.swing.JTextField();
        zipcodeTxt = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        DobField = new javax.swing.JFormattedTextField();
        addressTxt1 = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        townTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        zipCode = new javax.swing.JLabel();
        genderCmb = new javax.swing.JComboBox();
        emailID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        countryCmb = new javax.swing.JComboBox();
        firstName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        nursePane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordTxt = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        nurseNetworkCmb = new javax.swing.JComboBox();
        createProfileButton = new javax.swing.JButton();
        emailID1 = new javax.swing.JLabel();
        expTxt = new javax.swing.JTextField();
        emailID2 = new javax.swing.JLabel();
        degTxt = new javax.swing.JTextField();
        emailID3 = new javax.swing.JLabel();
        covidConYesRbtn = new javax.swing.JRadioButton();
        covidConNoRbtn = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stateCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCmbActionPerformed(evt);
            }
        });
        add(stateCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 175, -1));
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 176, -1));
        add(zipcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 176, -1));

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");
        add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 194, -1));

        address1.setText("Address Line1 : ");
        add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        DobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobFieldActionPerformed(evt);
            }
        });
        add(DobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 176, -1));
        add(addressTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 175, -1));

        town.setText("City: ");
        add(town, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));
        add(townTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 176, -1));

        jLabel1.setText("Gender:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        zipCode.setText("Zip Code:");
        add(zipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        genderCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCmbActionPerformed(evt);
            }
        });
        add(genderCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 172, -1));

        emailID.setText("Email Address:");
        add(emailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jLabel3.setText("Country:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 178, -1));

        countryCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCmbActionPerformed(evt);
            }
        });
        add(countryCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 175, -1));

        firstName.setText("First Name:");
        add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel6.setText("State:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 176, -1));

        LastName.setText("Last Name:");
        add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 78, -1));

        nursePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nursePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Create User Account:");
        nursePane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 18, 409, -1));

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        nursePane.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 149, 172, -1));

        jLabel2.setText("Username");
        nursePane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 111, -1, -1));
        nursePane.add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 108, 172, -1));

        jLabel4.setText("Password");
        nursePane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 152, -1, -1));

        jLabel5.setText("Confirm Password");
        nursePane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 203, -1, -1));
        nursePane.add(confirmPasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 200, 172, -1));

        helpSeekerNw.setText("Please Select the Closest City");
        nursePane.add(helpSeekerNw, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 244, -1, -1));

        nurseNetworkCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseNetworkCmbActionPerformed(evt);
            }
        });
        nursePane.add(nurseNetworkCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 241, 172, -1));

        createProfileButton.setText("Register");
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });
        nursePane.add(createProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 282, 96, -1));

        add(nursePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        emailID1.setText("University");
        add(emailID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));
        add(expTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 178, -1));

        emailID2.setText("Degree");
        add(emailID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));
        add(degTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 178, -1));

        emailID3.setText("In contact with Covid positive person in last 15 days?");
        add(emailID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        buttonGroup1.add(covidConYesRbtn);
        covidConYesRbtn.setText("Yes");
        add(covidConYesRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        buttonGroup1.add(covidConNoRbtn);
        covidConNoRbtn.setText("No");
        add(covidConNoRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("PT Serif Caption", 0, 36)); // NOI18N
        jLabel9.setText("Register As a Nurse: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 600, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finalopaquebg.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1300, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void stateCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateCmbActionPerformed

    }//GEN-LAST:event_stateCmbActionPerformed

    private void genderCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCmbActionPerformed

    private void countryCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCmbActionPerformed

        stateCmb.removeAllItems();

        if(countryCmb.getSelectedIndex()>0)
        {
            stateCmb.addItem("Please select a State");
            HashSet<String> hsstateVal = new HashSet<>();
            for (Network network : ecoSystem.getNetworkList())
            {
                if(network.getCountry().equals(countryCmb.getSelectedItem()))
                {
                    hsstateVal.add(network.getState());
                }
            }
            for(String s1 : hsstateVal)
            {
                stateCmb.addItem(s1);
            }
        }

    }//GEN-LAST:event_countryCmbActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void nurseNetworkCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseNetworkCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseNetworkCmbActionPerformed

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed

        try
        {
            if(countryCmb.getSelectedIndex()<1 || stateCmb.getSelectedIndex()<1)
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(genderCmb.getSelectedIndex()<1 )
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(DobField.getText()) ;

            int age = GetOrganizations.calculateAge(dateOfBirthVal);

            String firstName =   firstNameTxt.getText();
            String lastName = lastNameTxt.getText();
            String address1 = addressTxt1.getText();
            String town = townTxt.getText();
            String zipCode = zipcodeTxt.getText();
            String emailId = emailTxt.getText();
            String gender = (String)genderCmb.getSelectedItem();
            String country = (String)countryCmb.getSelectedItem();
            String state = (String)stateCmb.getSelectedItem();
            String exp = expTxt.getText();
            String degree = degTxt.getText();
            boolean isCovid = false;
            if(covidConYesRbtn.isSelected()){
                isCovid= true;
            }
           
            System.out.println(isCovid);

            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                town!=null && !town.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && age > 0
                &&  country!=null && !country.isEmpty()
                &&  state!=null && !state.isEmpty()
                     && !exp.isEmpty()
                     && !degree.isEmpty()
            )
            {
                Person person = null;

                if(passwordTxt.getPassword().length ==0 || confirmPasswordTxt.getPassword().length == 0 ||
                    userNameTxt.getText().trim().isEmpty() || nurseNetworkCmb.getSelectedIndex()<1
                )
                {
                    JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(nurseNetworkCmb.getSelectedIndex()<1)
                {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String userName = userNameTxt.getText();
                String password = String.valueOf(passwordTxt.getPassword());
                String confirmPassword =String.valueOf(confirmPasswordTxt.getPassword());

                Network nurseNw = (Network)nurseNetworkCmb.getSelectedItem();
                if(!(password.equals(confirmPassword)))
                {
                    JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                    organization.getPersonDirectory().getNurseList().remove(person);
                    return;
                }

                getEnterprise(nurseNw);
                if(enterprise == null)
                {
                    JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+nurseNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                getOrganization("NurseSchool",enterprise);

                if(organization == null)
                {
                    JOptionPane.showMessageDialog(null, "Nurse Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Nurse nurse;
                person = organization.getPersonDirectory().addNurse();
                person.setNurse(true);
                nurse =(Nurse)person;

                for(Enterprise e : nurseNw.getEnterpriseDirectory().getEnterpriseList())
                {  
                    for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUserName().equals(userName))
                        {
                            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else
                        {
                            for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                            {
                                
                                for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                                {
                                    if(ua1.getUserName().equals(userName))
                                    {
                                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                {
                    JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                   organization.getPersonDirectory().getNurseList().remove((Nurse)person);
                    return;
                }
                // To get patient org

                UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new NurseRole());
                userAccount.setPerson(person);
                userAccount.setNetwork((Network)nurseNw);

                DoctorWorkRequest request = new DoctorWorkRequest();
                request.setMessage(DoctorWorkRequest.REQUEST_APPROVAL);
                request.setSender(userAccount);
                request.setStatus(DoctorWorkRequest.REQUEST_SENT);
                request.setRequestDate(new Date());

                for(Enterprise e : nurseNw.getEnterpriseDirectory().getEnterpriseList())
                {
                    if(e instanceof CoVolunteerEnterprise)
                    {
                        for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
                        {
                            if (organization instanceof NurseSchoolHeadOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                            }
                        }

                    }
                }
//
                if (organization!=null){
                    organization.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.setEnabled(false);
                }
                System.out.println("nursehead requests");
                System.out.println(organization.getWorkQueue().getWorkRequestList());

                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                person.setEmailId(emailId);
                person.setDob(dateOfBirthVal);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);
                nurse.setDegree(degree);
                nurse.setExperience(exp);
                nurse.setPoscov(isCovid);
                


                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        }

        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");

        }
        catch(ParseException e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");

        }
        catch(NullPointerException e )
        {
            JOptionPane.showMessageDialog(null, "Organization does not exist! ");

        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");

        }
    }//GEN-LAST:event_createProfileButtonActionPerformed

    private void DobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DobFieldActionPerformed
 public void getEnterprise(Network network)
    {
          try
                {
                 for (Network n : ecoSystem.getNetworkList())
                    {
                    if(n.getCity().equals(network.getCity()))   
                    {  
                   for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
                      {
                            if(e instanceof CoVolunteerEnterprise)
                           {
                             this.enterprise = e;
                              network = n;
                            }
                      }
                    }
                    }
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                     
                }
    }
     public void resetFields()
    {
     userNameTxt.setText("");
     passwordTxt.setText("");
     confirmPasswordTxt.setText("");
    firstNameTxt.setText("");
    lastNameTxt.setText("");
    DobField.setText("");
    addressTxt1.setText("");
    townTxt.setText("");
    expTxt.setText("");
    degTxt.setText("");
    buttonGroup1.clearSelection();
    emailTxt.setText("");
    
     
    }
     public void getOrganization(String orgVal, Enterprise e){
     
        try
        {
     for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
          
     if(orgVal.equals("NurseSchool") && organization instanceof NurseSchoolOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
              
             }  
       
             }
        }
        catch(Exception ex)
        {
             
        }
    }

     private void addInputVerifiers() {
        InputVerifier stringValidation = new StringValidation();
        firstNameTxt.setInputVerifier(stringValidation);
        lastNameTxt.setInputVerifier(stringValidation);
        addressTxt1.setInputVerifier(stringValidation);
        townTxt.setInputVerifier(stringValidation);
        addressTxt1.setInputVerifier(stringValidation);
        userNameTxt.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new PasswordValidation();
        passwordTxt.setInputVerifier(passwordValidation);
        confirmPasswordTxt.setInputVerifier(passwordValidation);
        
        InputVerifier dobValidtion = new DOBValidation();
        DobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new NumberValidation();
        zipcodeTxt.setInputVerifier(numberValidation);
        
        InputVerifier emailValidtion = new EmailValidation();
        emailTxt.setInputVerifier(emailValidtion);
      
    }

    private void populateCountryComboBox() {
        countryCmb.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");  
         return;        
        }
        countryCmb.addItem("Please select a country");
        String networkVal = "";   
        HashSet<String> hs = new HashSet();
           
        for(Network network : ecoSystem.getNetworkList()){
           if(!network.getCountry().equals(networkVal))
           {
               hs.add(network.getCountry());
           }
        }
        for(String s : hs)
        {
         countryCmb.addItem(s);
        }
    }

    private void populateNetworkComboBox() {
        nurseNetworkCmb.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        nurseNetworkCmb.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             nurseNetworkCmb.addItem(network);
         }
    }
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DobField;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address1;
    private javax.swing.JTextField addressTxt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPasswordTxt;
    private javax.swing.JComboBox countryCmb;
    private javax.swing.JRadioButton covidConNoRbtn;
    private javax.swing.JRadioButton covidConYesRbtn;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JTextField degTxt;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JLabel emailID2;
    private javax.swing.JLabel emailID3;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField expTxt;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JComboBox genderCmb;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JComboBox nurseNetworkCmb;
    private javax.swing.JLayeredPane nursePane;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox stateCmb;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipcodeTxt;
    // End of variables declaration//GEN-END:variables

    
}