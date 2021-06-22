import './App.css';
import React, { Component } from 'react';
import FullName from './FullName/FullName';

class App extends Component {

  render() {
    return (
      <div className="App">
        <h2>Greeting Application</h2>
        <FullName />
      </div>
    );
  }
}


export default App;
