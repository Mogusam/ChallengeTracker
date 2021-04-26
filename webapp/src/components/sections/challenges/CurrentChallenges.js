import React, {useState, useEffect} from 'react';
import classNames from 'classnames';
import { SectionTilesProps } from '../../../utils/SectionProps';
import SectionHeader from './../partials/SectionHeader';
import Image from '../../elements/Image';
import ChallengeCard from './ChallengeCard';


const propTypes = {
  ...SectionTilesProps.types
}

const defaultProps = {
  ...SectionTilesProps.defaults
}
const CurrentChallenges = ({
  className,
  topOuterDivider,
  bottomOuterDivider,
  topDivider,
  bottomDivider,
  hasBgColor,
  invertColor,
  pushLeft,
  ...props
}) => {

  const [error, setError] = useState(null);
  const [isLoaded, setIsLoaded] = useState(false);
  const [items, setItems] = useState([]);

  const challengesUrl = 'http://localhost:8090/api/challenges/first-open/3';
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
    'features-tiles section',
    topOuterDivider && 'has-top-divider',
    bottomOuterDivider && 'has-bottom-divider',
    hasBgColor && 'has-bg-color',
    invertColor && 'invert-color',
    className
  );

  const innerClasses = classNames(
    'features-tiles-inner section-inner pt-0',
    topDivider && 'has-top-divider',
    bottomDivider && 'has-bottom-divider'
  );

  const tilesClasses = classNames(
    'tiles-wrap center-content',
    pushLeft && 'push-left'
  );

  const sectionHeader = {
    title: 'Current challenges:',
    paragraph: 'Here you can see list of  public challenges  which now in progress'
  };



if (isLoaded){

  return (
    <section
      {...props}
      className={outerClasses}
    >
      <div className="container">
        <div className={innerClasses}>
          <SectionHeader data={sectionHeader} className="center-content" />
          <div className={tilesClasses}>
             {items.map(item =>
                <ChallengeCard
                    name={item.stopStrategy}
                    startDate={item.startDate}
                    endDate={item.endDate}
                    type={item.type}
                    typeId={item.typeId}>
                </ChallengeCard>
            )}
          </div>
        </div>
      </div>
    </section>
  );
}
else{

  return <h4> Loading ......</h4>
}
}

CurrentChallenges.propTypes = propTypes;
CurrentChallenges.defaultProps = defaultProps;

export default CurrentChallenges;