import './App.css';
import React, { Component } from 'react';
import EmpData from './EmpData/EmpData';

class App extends Component {

  state = {
    emp: [
      { empid: 101, name: "Anita", salary: 25000 },
      { empid: 200, name: "Bharati", salary: 30000 },
      { empid: 100, name: "Uma", salary: 43000 }
    ]
  }
  render() {

    let emp = null;
    emp = (
      <div>
        {this.state.emp.map(ele => {
          return (
            <tr>
              <td><EmpData empid={ele.empid} /></td>
              <td><EmpData name={ele.name} /></td>
              <td><EmpData salary={ele.salary} /></td>
            </tr>
          )
        })}
      </div>
    )

    return (
      <div className="App">
        <h1>Employee Data</h1>
        <table align="center">
        {emp}
        </table>
      </div>
    );
  }
}


export default App;
