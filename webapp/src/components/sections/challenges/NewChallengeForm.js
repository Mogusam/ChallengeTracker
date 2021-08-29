import React, {useState, useEffect} from 'react';
import classNames from 'classnames';
import { SectionProps } from '../../../utils/SectionProps';
const NewChallengeForm = ({className,
                             topOuterDivider,
                             bottomOuterDivider,
                             topDivider,
                             bottomDivider,
                             hasBgColor,
                             invertColor
}) => {

  const [error, setError] = useState(null);
  const [isLoaded, setIsLoaded] = useState(false);
  const [items, setItems] = useState([]);

  const challengesUrl = 'http://localhost:8090/challenges/create-new';



    useEffect(() => {
      fetch(challengesUrl,   {
        mode:'no-cors',
        credentials: "include"
      })
        .then(res => res.json())
        .then(
          (result) => {

            setIsLoaded(true);
            setItems(result);

          },
          // Note: it's important to handle errors here
          // instead of a catch() block so that we don't swallow
          // exceptions from actual bugs in components.
          (error) => {
            setIsLoaded(true);
            setError(error);
          }
        )
    }, []);

const outerClasses = classNames(
    'hero section center-content',
    topOuterDivider && 'has-top-divider',
    bottomOuterDivider && 'has-bottom-divider',
    hasBgColor && 'has-bg-color',
    invertColor && 'invert-color',
    className
  );

  const innerClasses = classNames(
    'hero-inner section-inner',
    topDivider && 'has-top-divider',
    bottomDivider && 'has-bottom-divider'
  );
if(isLoaded){
    return(
        <section

          className={outerClasses}
        >
          <div className="container-sm">
            <div className={innerClasses}>
             <div className=" mb-16 center-content">
                <h4> New Challenge Form will be HERE </h4>

            </div>
            </div>
            </div>
        </section>

        );
    } else {
        return <h4> Loading ......</h4>
    }
}

export default NewChallengeForm