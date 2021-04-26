import React from 'react';
// import sections
import Hero from '../components/sections/Hero';
import CurrentChallenges from '../components/sections/challenges/CurrentChallenges';
import CreateNewChallenge from '../components/sections/challenges/CreateNewChallenge';
import Testimonial from '../components/sections/Testimonial';
import Cta from '../components/sections/Cta';

const Home = () => {

  return (
    <>
      <Hero className="illustration-section-01" />
      <CurrentChallenges />
      <CreateNewChallenge />
      <Testimonial topDivider />
      <Cta split />

    </>
  );
}

export default Home;