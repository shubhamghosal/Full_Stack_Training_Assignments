import React from 'react';
const SkillListComponent = (props) => {

    return (
        <div className="Person">
            <ol>
                <li>{props.children[0]}</li>
                <li>{props.children[1]}</li>
                <li>{props.children[2]}</li>
                <li>{props.children[3]}</li>
            </ol>
        </div>
    );
}

export default SkillListComponent;
