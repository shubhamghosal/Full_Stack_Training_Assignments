import './App.css';
import React, { Component } from 'react';
import SkillListComponent from './SkillListComponent/SkillListComponent';

class App extends Component {

  render() {
    return (
<div className="App">
  <h1>Skill List Component</h1>
     <SkillListComponent>
       <p>NodeJS</p>
       <p>ReactJS</p>
       <p>Angular 10</p>
       <p>Mongo DB</p>
     </SkillListComponent>
    </div>
    );
  }
}


export default App;
