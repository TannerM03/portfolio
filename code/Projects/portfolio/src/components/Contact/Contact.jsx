import React from 'react'
import { getImageUrl } from '../../utils'
import styles from "./Contact.module.css"

export const Contact = () => {
  return <footer id = "contact" className = {styles.container}>
    <div className = {styles.text}>
        <h2>Contact</h2>
        <p>Feel free to reach out!</p>
        </div>
    <ul className = {styles.links}>
        <li className = {styles.link}>
            <img src={getImageUrl("contact/emailIcon.png")} alt="Email icon" />
            <a href="mailto:tanner.macpherson3@gmail.com">tanner.macpherson3@gmail.com</a>
        </li>
        <li className = {styles.link}>
            <img src={getImageUrl("contact/linkedinIcon.png")} alt="LinkedIn Icon" />
            <a href="https://www.linkedin.com/in/tannermacpherson/">linkedin.com/tannermacpherson</a>
        </li>
        <li className = {styles.link}>
            <img src={getImageUrl("contact/githubIcon.png")} alt="Github icon" />
            <a href="https://github.com/tannerm03">github.com/tannerm03</a>
        </li>
    </ul>
  </footer>
}
