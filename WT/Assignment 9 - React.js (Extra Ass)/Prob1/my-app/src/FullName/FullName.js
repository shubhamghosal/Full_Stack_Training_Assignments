import React, { Component } from 'react';

class FullName extends Component {
    constructor(props) {
        super(props);
        this.state = {
            fname: '',
            lname: '',
            fullname: ''
        };
    }
    getfname = e => {
        this.setState({ fname: e.target.value })
    };
    getlname = e => {
        this.setState({ lname: e.target.value })
    };
    getfullName = () => {
        this.setState({ fullname: "Hello " + this.state.fname + " " + this.state.lname })
    };
    render() {
        return (
            <div>
                First Name : <input id="text" onChange={this.getfname} /><br />
                Last Name : <input id="text" onChange={this.getlname} /><br />
                <button id="btn" onClick={this.getfullName}>Submit</button><br />
                <span>{this.state.fullname}</span>
            </div>
        )
    }
}
export default FullName;