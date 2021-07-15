import React, { Component } from 'react';
import ChildComponent from './ChildComponent/ChildComponent';
import './App.css';
class App extends Component {
  render () {
    return (
      <div className="App">
        <h2>Addition Application</h2>
        <ChildComponent />
      </div>
    );
  }
};

export default App;
