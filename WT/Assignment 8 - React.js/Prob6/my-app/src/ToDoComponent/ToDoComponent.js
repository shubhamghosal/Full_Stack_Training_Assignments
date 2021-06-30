import React, { Component } from 'react';
import "./ToDoComponent.css"

class ToDoComponent extends Component {

    state = {
        text: "",
        list: []
    }
    addItemHandler = () => {

        if (this.state.text !== "") {
            this.setState({
                list: this.state.list.concat([this.state.text])
            });
        }
    }
    delItemHandler = (eve) => {
        this.setState({
            text: "",
            list: this.state.list.filter((ele) => ele !== eve.target.innerHTML)
        });
    }
    changeHandler = (inp) => {
        this.state.text = inp.target.value;
    }
    render() {
        return (
            <div>
                <h2>TODO LIST</h2>
                <input type="text" name="item" placeholder="add item..." onChange={this.changeHandler} />
                <input type="button" value="ADD" onClick={this.addItemHandler} />
                <ol>
                    {this.state.list.map(item => <li key={Math.random()} onClick={this.delItemHandler}>{item}</li>)}
                </ol>
            </div>
        );
    }
}


export default ToDoComponent;
