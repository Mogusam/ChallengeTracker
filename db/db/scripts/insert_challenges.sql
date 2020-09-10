INSERT INTO public.challenge(
          template_id, start_date, end_date, access, stop_strategy, state, moderated, challenge_settings)
         VALUES
         (  1, '12/12/1999', '12/12/2000', 'Y', 'W', 'C', 'N', '{"desc":"NO"}'),
         ( 2, '12/12/2000', '12/12/2005', 'Y', 'W', 'C', 'N', '{"desc":"YNO"}'),
         ( 1, '12/01/2005', '12/12/2006', 'Y', 'W', 'C', 'N', '{"desc":"3NO"}'),
         ( 1, '12/12/2008', '12/12/2009', 'Y', 'W', 'C', 'N', '{"desc":"N6O"}');
