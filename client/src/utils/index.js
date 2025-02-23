export const daysLeft = (deadline) => {
  const now = new Date().getTime(); // Current time in milliseconds
  const deadlineMs = Number(deadline) * 1000; // Convert seconds to milliseconds

  const timeLeft = deadlineMs - now;
  const daysLeft = Math.max(0, Math.floor(timeLeft / (1000 * 60 * 60 * 24))); // Convert milliseconds to days

  return daysLeft+1;
};
// const daysLeft = (deadline) => {
//   console.log("Raw Deadline Value:", deadline); // Debugging line
//   const deadlineDate = new Date(Number(deadline) * 1000); // Convert from seconds to milliseconds
//   console.log("Parsed Deadline Date:", deadlineDate);

//   if (isNaN(deadlineDate.getTime())) return "Invalid Date"; // Handle invalid dates

//   const difference = deadlineDate - new Date();
//   const remainingDays = Math.ceil(difference / (1000 * 3600 * 24));

//   return remainingDays > 0 ? remainingDays : 0; // Ensure non-negative output
// };

  
  export const calculateBarPercentage = (goal, raisedAmount) => {
    const percentage = Math.round((raisedAmount * 100) / goal);
  
    return percentage;
  };
  
  export const checkIfImage = (url, callback) => {
    const img = new Image();
    img.src = url;
  
    if (img.complete) callback(true);
  
    img.onload = () => callback(true);
    img.onerror = () => callback(false);
  };