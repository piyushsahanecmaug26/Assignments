#include <iostream>
#include <cmath>

using namespace std;

// compute rms
double computeRMS(double* signal, int n)
{
    double sum = 0;

    for(int i=0; i<n; i++)
    {
        sum = sum + (*(signal+i) * *(signal+i));
    }

    return sqrt(sum/n);
}


// normalise
void normalise(double* signal, int n)
{
    double maxvalue = 0;

    // find max value
    for(int i=0; i<n; i++)
    {
        if(fabs(*(signal+i)) > maxvalue)
        {
            maxvalue = fabs(*(signal+i));
        }
    }

    // divide all values by max value
    for(int i=0; i<n; i++)
    {
        *(signal+i) = *(signal+i) / maxvalue;
    }
}


// count zero crossing
int countZeroCrossings(double* signal, int n)
{
    int count=0;

    for(int i=0; i<n-1; i++)
    {
        if((*(signal+i)<0 && *(signal+i+1)>0) ||
           (*(signal+i)>0 && *(signal+i+1)<0))
        {
            count++;
        }
    }

    return count;
}


// apply gain
void applyGain(double* signal, int n, double gainFactor)
{
    for(int i=0; i<n; i++)
    {
        *(signal+i) = *(signal+i) * gainFactor;
    }
}


// print array
void printArray(double* signal, int n)
{
    for(int i=0; i<n; i++)
    {
        cout << *(signal+i) << " ";
    }

    cout << endl;
}


int main()
{
    double signal[] = {0.5,-1.2,0.8,-0.3,1.0,-0.9,0.1};

    int n=7;

    cout << "Original array : ";
    printArray(signal,n);

    double rms = computeRMS(signal,n);

    cout << "RMS = " << rms << endl;

    int crossings = countZeroCrossings(signal,n);

    cout << "Zero Crossings = " << crossings << endl;

    cout << "After normalise : ";
    normalise(signal,n);
    printArray(signal,n);

    cout << "After applyGain : ";
    applyGain(signal,n,2.0);
    printArray(signal,n);

    return 0;
}
