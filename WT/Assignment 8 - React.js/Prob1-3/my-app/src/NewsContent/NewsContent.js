import React from 'react';
import "./News.css"
const News = (props) => {

    return (
        <div className="news">
            <header>
                <a href={props.url}><h3>{props.head}</h3></a>
            </header>
            <img src={props.img} alt="error" />
            <section>
                <p>{props.article}</p>
            </section>
        </div>
    );
}

export default News;