import React, { useState } from "react";
import "../App.css";

function Registration() {
  const [data, setData] = useState({
    fname: "",
    lname: "",
    email: "",
    address: "",
    gender:"",
    dob:"",
    phone: "",
    password: "",
    cpassword: ""
  });

  const handleChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };
  

  const submitForm = (e) => {
    e.preventDefault();

    if (
      data.fname === "" ||
      data.lname === "" ||
      data.email === "" ||
      data.address === "" ||
      data.dob === "" ||
      data.gender === "" ||
      data.phone === "" ||
      data.password === "" ||
      data.cpassword === ""
    ) {
      alert("Please fill all fields");
      return;
    }

    if (data.password !== data.cpassword) {
      alert("Passwords do not match");
      return;
    }

    if (data.password.length < 6) {
      alert("Password must be at least 6 characters long");
      return;
    }

    alert("Registration Successful!");
  };

  return (
    <div className="box">
      <h2>Registration Form</h2>

      <form onSubmit={submitForm}>
        <label>First Name</label>
        <input name="fname" value={data.fname} onChange={handleChange} />

        <label>Last Name</label>
        <input name="lname" value={data.lname} onChange={handleChange} />

        <label>Email</label>
        <input type="email" name="email" value={data.email} onChange={handleChange} />

        <label>Address</label>
        <select name="address" value={data.address} onChange={handleChange}>
          <option value="">Select Address</option>
          <option>Mysore</option>
          <option>ChamarajaNagar</option>
          <option>Sri ranga pana</option>
          <option>thumakur</option>
          <option>Mandya</option>
        </select>
    
       <label>Gender</label>
        <select name="gender" value={data.gender} onChange={handleChange}>
          <option value="">Select Gender</option>
          <option>Female</option>
          <option>Male</option>
          <option>Other</option>
        </select>
       
         <label>Date of Birth</label>
        <input type="date" name="dob" value={data.dob} onChange={handleChange} />
         
        <label>Phone Number</label>
      <input type="text" name="phone" value={data.phone} maxLength="10" onChange={(e) => { const onlyNums = e.target.value.replace(/\D/g, "").slice(0, 10); setData({ ...data, phone: onlyNums }); }} placeholder="Enter 10-digit number"/>




        <label>Password</label>
        <input type="password" minLength={6} name="password" value={data.password} onChange={handleChange} />

        <label>Confirm Password</label>
        <input type="password" name="cpassword" value={data.cpassword} onChange={handleChange} />

        <button type="submit">Register</button>
      </form>
    </div>
  );
}

export default Registration;