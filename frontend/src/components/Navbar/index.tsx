import './styles.css';
import { ReactComponent as GitHubIcon } from 'assets/img/github.svg'
import { ReactComponent as LinkedIn } from 'assets/img/linkedin-logo.svg'


function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <div className="dsmovie-social-container">
                        <a href="https://linkedin.com/in/mvidaldev" target='_blank' rel='nooppener noreferrer'  >
                            <div className="dsmovie-contact-container">
                                <LinkedIn />
                                <p className="dsmovie-contact-link">/mvidaldev</p>
                            </div>
                        </a>
                        <a href="https://github.com/mvidaldev" target='_blank' rel='nooppener noreferrer'  >
                            <div className="dsmovie-contact-container">
                                <GitHubIcon />
                                <p className="dsmovie-contact-link">/mvidaldev</p>
                            </div>
                        </a>
                    </div>


                </div>
            </nav>
        </header >
    );
}

export default Navbar;
