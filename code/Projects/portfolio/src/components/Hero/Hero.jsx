import React from 'react';
import { getImageUrl } from '../../utils';
import styles from "./Hero.module.css";

function Hero() {
  return (
     <section className = {styles.container} id = "home">
        <div className = {styles.content}>
            <h1 className = {styles.title}>Hi! I'm Tanner Macpherson</h1>
        <p className = {styles.description}>I'm a student at UNC Chapel Hill pursuing a B.S. in Computer Science along with a B.A. in Hispanic Studies</p>
        <a href="mailto:tanner.macpherson3@gmail.com" className = {styles.contactBtn}>Contact Me</a>
        </div>
        <img src={getImageUrl("hero/headshot.jpg")} alt="Hero image of me" className = {styles.heroImg} />
        <div className = {styles.topBlur} />
        <div className = {styles.bottomBlur} /> 
      </section> 
  )
}

export default Hero




