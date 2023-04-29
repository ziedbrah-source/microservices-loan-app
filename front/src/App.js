import React, { useState } from "react";
import axios from "axios";
import "./App.css";
import "./Form.module.css";

function App() {
  const [formData, setFormData] = useState({
    fullName: "",
    email: "",
    loanAmount: "",
    loanTerm: "",
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(
        "http://localhost:5432/submit",
        formData
      );
      alert("Loan application submitted successfully!");
    } catch (error) {
      alert("An error occurred while submitting your application.");
    }
  };

  return (
    <div className={"app-container"}>
      <div className={"form-container"}>
        <h1>Bank Loan Application Form</h1>
        <form onSubmit={handleSubmit}>
          <label htmlFor="fullName">Full Name:</label>
          <input
            type="text"
            id="fullName"
            name="fullName"
            value={formData.fullName}
            onChange={handleChange}
            required
          />
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
          <label htmlFor="loanAmount">Loan Amount:</label>
          <input
            type="number"
            id="loanAmount"
            name="loanAmount"
            value={formData.loanAmount}
            onChange={handleChange}
            required
          />
          <label htmlFor="loanTerm">Loan Term (years):</label>
          <input
            type="number"
            id="loanTerm"
            name="loanTerm"
            value={formData.loanTerm}
            onChange={handleChange}
            required
          />
          <button type="submit">Submit Application</button>
        </form>
      </div>
    </div>
  );
}

export default App;
