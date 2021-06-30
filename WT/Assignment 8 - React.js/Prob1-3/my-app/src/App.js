import './App.css';
import React, { Component } from 'react';
import News from './NewsContent/NewsContent';

class App extends Component {

  state = {
    news: [
      {
        img: "https://images.indianexpress.com/2021/06/school.jpg",
        url: "https://indianexpress.com/article/education/new-learning-spaces-to-teacher-postings-punjabs-schools-topping-mantra-7350171/",
        head: "New learning spaces to teacher postings: Punjab’s topping mantra",
        article: "When the Education Ministry released the latest edition of the Performance Grading Index, Punjab was right on top in the overall ranking, scoring 929 points out of 1,000 and leaving star performances such as Kerala (fourth) and Delhi (sixth position) behind."
      },
      {
        img: "https://images.hindustantimes.com/img/2021/06/08/550x309/UK_vaccine_1623085258604_1623181506989.jpg",
        url: "https://www.hindustantimes.com/india-news/centre-orders-440-million-more-covid-19-vaccine-doses-101623181445131.html",
        head: "Centre orders 440 million more Covid-19 vaccine doses",
        article: "The Centre on Tuesday placed fresh orders for 440 million additional doses of Covid-19 vaccines – 250 million doses of Covishield and 190 million of Covaxin – a day after Prime Minister Narendra Modi announced that the Union government was taking back the responsibility for procuring vaccines and distributing them for free to states."
      },
      {
        img: "https://images.hindustantimes.com/img/2021/06/08/550x309/ed431e6e-c52b-11eb-a69e-010fcdd27e0e_1622808016112_1623177609697.jpg",
        url: "https://www.hindustantimes.com/india-news/covaxin-effective-against-covid-19-variants-icmr-study-101623177465603.html",
        head: "Covaxin effective against Covid-19 variants’: ICMR study",
        article: "The research, which is yet to be peer reviewed, also discovered that the vaccine is thrice as effective in creating antibodies as a previous Covid infection. To be sure, other research has shown that a previous infection does confer stronger immunity ."
      }
    ]
  }

  render() {
    return (
      <div className="App">
        <h1>Welcome to my react based News Application</h1>
        <div>
        <News head={this.state.news[0].head} article={this.state.news[0].article} img={this.state.news[0].img} url={this.state.news[0].url} />
        </div><br/>
        <div>
        <News head={this.state.news[1].head} article={this.state.news[1].article} img={this.state.news[1].img} url={this.state.news[1].url} />
        </div><br/>
        <div>
        <News head={this.state.news[2].head} article={this.state.news[2].article} img={this.state.news[2].img} url={this.state.news[2].url} />
        </div><br/>
      </div>
    );
  }
}


export default App;
