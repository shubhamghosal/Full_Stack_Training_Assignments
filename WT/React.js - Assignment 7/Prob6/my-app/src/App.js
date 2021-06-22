import './App.css';
import React, { Component } from 'react';
import ToDoComponent from './ToDoComponent/ToDoComponent';

class App extends Component {

  render() {
    return (
      <div className="App">
        <ToDoComponent />
      </div>
    );
  }
}


export default App;
