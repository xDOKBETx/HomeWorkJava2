/* 2. Реализуйте алгоритм сортировки пузырьком числового массива. 
Результат после каждой итерации запишите в лог-файл.
*/
import java.io.IOException;
import java.util.logging.*;

public class TaskJava2 {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(TaskJava2.class.getName());
        FileHandler fh = new FileHandler("loggerTaskJava2.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] nums = { 9, 6, 5, 1, 7, 2, 3, 8, 0 };
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            logger.log(Level.INFO, "Сообщение");

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }

        }

        for (int i : nums) {
            System.out.println(i);
        }

    }

}
