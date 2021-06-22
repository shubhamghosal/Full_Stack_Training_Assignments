import React from 'react';
import "./EmpData.css"
const EmpData = (props) => {

    return (
        <div className="Emp">
            {props.empid}{props.name}{props.salary}
        </div>

    );
}

export default EmpData;
