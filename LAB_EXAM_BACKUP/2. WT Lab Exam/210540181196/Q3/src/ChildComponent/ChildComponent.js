import React, { Component } from 'react';

class ChildComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      num1: '',
      num2: '',
      result: ''
    };
  }
  getnum1 = e => {
    this.setState({ num1: e.target.value })
  };
  getnum2 = e => {
    this.setState({ num2: e.target.value })
  };
  getresult = () => {
    this.setState({ result: "Sum is : " + (parseInt(this.state.num1) + parseInt(this.state.num2)) })
  };
  render() {
    return (
      <div>
        Number 1 : <input id="text" onChange={this.getnum1} /><br />
        Number 2 : <input id="text" onChange={this.getnum2} /><br />
        <button id="btn" onClick={this.getresult}>Add</button><br />
        <span>{this.state.result}</span>
      </div>
    )
  }

}
export default ChildComponent;