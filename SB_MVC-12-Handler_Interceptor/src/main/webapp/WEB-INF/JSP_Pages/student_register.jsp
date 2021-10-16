<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="img/header.png" type="image/x-icon">
<link rel="stylesheet" href="css js/forms.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>MySchool</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript" src="css js/StudentForm.js"> </script>
<script>
	$(function() {
		$("#header").load("header");
		$("#footer").load("footer");
	});
	
	function resetForm(){
		   document.getElementById("StudForm").reset();  
	}
	
	function freezeDt(){
	var d_regDt= StudForm.regdt.value;
	if(d_regDt=="" || d_regDt==null){
	}else{
		StudForm.regdt.disabled=true;
	}
	}
</script>
</head>
<body onload="freezeDt()" >
	<div id="header"></div>
 <div class="form_wrapper">
         <div class="form_container">
            <div class="title_container">
               <h2 class="headColor"><b>Student Registration Form</b></h2>
            </div>
           	 <div class="col_half">
			 </div>
            <div class="row clearfix">
               <div class="">
                  <sform:form modelAttribute="student"  method="POST" action="addStudent" id="StudForm" onsubmit="return validate(this)" > <p style="color:red;"><sform:errors path="*"/></p>
                     <table >
                        <tr>
                        <td>
                              <div class="col_half"><font class="MytdColor">ENROLL no.</font>
                                 <div class="input_field"> <span><i aria-hidden="true" class="fa fa-id-card"></i></span>
                                    <sform:input path="ENROLLID" type="text" name="ENROLLID" placeholder="ENROLL no." readonly="true" />
                                 </div>
                              </div>
                           </td>
                           <td>
                              <div class="col_half"><font class="MytdColor">Roll no.</font>
                                 <div class="input_field"> <span><i aria-hidden="true" class="fa fa-id-card"></i></span>
                                    <sform:input path="ROLLID" type="text" name="roll" placeholder="Roll no."  required="true"/>
                                 </div><span style="color:red;" id="spanRoll"></span>
                              </div>
                           </td>
                           <td>
                             <div class="" id="divRegDt"><font class="MytdColor">Date Of Registration:</font>
								 <div class="input_field"> <span><i aria-hidden="true" class="fa fa-calendar"></i></span>
                                     <sform:input path="regdt" type="datetime-local" name="regdt" id="regdt" />
                                 </div>
                                 </div>
                           </td>
                        </tr>
                        <tr>
                           <div class="row clearfix">
                              <td>
                                 <div class=""><font class="MytdColor">First Name</font>
                                 <span style="color:red;" id="spanfname"></span>
                                    <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
                                        <sform:input path="fname" type="text" name="fname" placeholder="First Name" /> 
                                    </div>
                                 </div>
                              </td>
                              <td>
                                 <div class=""><font class="MytdColor">Middle Name</font>
                                 <span style="color:red;" id="spanmname"></span>
                                    <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
                                       <sform:input path="mname" type="text" name="mname" placeholder="Middle Name"  /> 
                                    </div>
                                 </div>
                              </td>
                              <td>
                                 <div class=""><font class="MytdColor">Last Name</font>
                                 <span style="color:red;" id="spanlname"></span>
                                    <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
                                         <sform:input path="lname" type="text" name="lname" placeholder="Last Name"  />
                                    </div>
                                 </div>
                              </td>
                           </div>
                        </tr>
                        <tr>
                           <td>
                             <span style="color:red;" id="spanemail"></span><font class="MytdColor">Email</font>
                              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-envelope"></i></span>
                                 <sform:input path="email" type="email" name="email" placeholder="Email"  />   
                              </div>
                           </td>
						   <td>
						   <span style="color:red;" id="spanmobile"></span><font class="MytdColor">Contact Number</font>
                              <div class="input_field"><span><i aria-hidden="true" class="fa fa-phone"></i></span>
                                  <sform:input path="mobile" type="text" name="mobile" placeholder="Contact Number"  />
                              </div>
                           </td>
                        </tr>
                        <tr>
                           <td>
                           <span style="color:red;" id="spanpasswrd"></span><font class="MytdColor">Password</font>
                              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-lock"></i></span>
                                   <sform:input path="passwrd" type="password" name="passwrd" placeholder="Password"  />   
                              </div>
                           </td>
                        </tr>
						 <tr>
                           <td>
                           <span style="color:red;" id="spanadd1"></span><font class="MytdColor">Address Line1</font>
                              <div class="input_field"><span><i aria-hidden="true" class="fa fa-location-arrow"></i></span>
                                   <sform:input path="address1" type="text" name="address1" placeholder="Address Line1"  />   
                              </div>
                           </td>
                           <td>
                           <span style="color:red;" id="spanadd2"></span><font class="MytdColor">Address Line2 </font>
                              <div class="input_field"><span><i aria-hidden="true" class="fa fa-location-arrow"></i></span>
                                  <sform:input path="address2" type="text" name="address2" placeholder="Address Line2"  /> 
                              </div>
                           </td>
                        </tr>
						
                        <tr>
                           <td>
                             <span style="color:red;" id="spangender"></span>
                              <div class="input_field radio_option">
								 Gender:  <sform:radiobutton path="gender" name="gender" id="rd1" value="M"/>
									<label for="rd1" >Male</label>
								  <sform:radiobutton  path="gender" name="gender" id="rd2" value="F"/>
									<label for="rd2" >Female</label> 
							<!--	Gender:  <sform:radiobutton path="gender" value="M"/>Male 
								<sform:radiobutton path="gender" value="F"/>Female -->
							  </div>
                           </td>
						   <td>
						      <span style="color:red;" id="spandob"></span>Date & Time Of Birth:
                              <div class="">
								 <div class="col_half input_field"> <span><i aria-hidden="true" class="fa fa-calendar"></i></span>
                                     <sform:input path="dob" type="date" name="dob" id="dob"  />
                                     </div>
                                <div class="col_half input_field">  <span><i class="fa fa-clock-o" aria-hidden="true"></i></span>
                                     <sform:input path="birthtime" type="time" name="birthtime" id="birthtime"  />
                                 </div>
                              </div>
                           </td>
                        <script language="JavaScript">   
                           	function getSections(){
                           		var standardsNum= StudForm.currentStandard.value;
								StudForm.action="sections";
								if(standardsNum!=""){
								StudForm.submit();
								}else{
									StudForm.currentSection.value="";
								}
							}
						</script>
                           <td>Year & Section:
                              <div class="select_option">
                              <span style="color:red;" id="spanstandard"></span>
                               <div class="col_half">
                                 <sform:select path="currentStandard" name="currentStandard" onchange="getSections()">
                                 <option value="">Select Standard</option>
                                  <sform:options items="${classStandardInfo}"/>
                                 </sform:select>
                                 </div>
                                 <div class="col_half">
                                 <sform:select path="currentSection" name="currentSection">
                                  <sform:options items="${sectionsDetails}"/>
                                 </sform:select>
                                 </div>
                              </div>
                           </td>
                        </tr>
                       <tr>
                           <td>
                              <div class="checkbox_option">
                               <sform:checkboxes path="terms"   name="terms" items="${chBox1}"  value="Y"/>
                                <!--   <sform:checkbox path="terms"  value="Y"/>I agree with terms and conditions -->
                              </div>
                               <span style="color:red;" id="spancheckboxterms"></span>
                           </td>
                           <td>
						      <span style="color:red;" id="spandoj"></span>
                              <div class="col_half">Date Of Joining:
								 <div class="input_field"> <span><i aria-hidden="true" class="fa fa-calendar"></i></span>
                                     <sform:input path="doj" type="date" name="doj" id="doj"  />
                                 </div>
                                 </div>
                              </td>
                        </tr> 
                        <tr>
                           <td>
                              <div class="checkbox_option">
                                <sform:checkboxes path="newsletter"   name="newsletter" items="${chBox2}" value="Y"/>
                              </div>
                               <span style="color:red;" id="spancheckboxnewsletter"> </span>
                           </td>
                        </tr>
                         </table>
                         <br>  <br>
                          <table>
                           <tr>
                           <td>
                           		 <div class="col_half">
                           		 <input class="BtnReset" type="reset" value="Cancel" />
                           		 </div>
                           </td>
                           <td>
                           <div class="">
                              <input class="button" type="submit" value="Register" />
                              </div>
                           </td>
                             <td>
                           		 <div class="col_half">
                           		 </div>
                           </td>
                        </tr>
                     </table>
                     <sform:hidden path="vflag" /> 
                  </sform:form>
               </div>
            </div>
         </div>
      </div>

	<div id="footer"></div>
</body>
</html>