package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelGangtoucunia extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer worm;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer branch;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer wormbranch;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tentaclebranch;
    private final AdvancedModelRenderer tentaclebranch2;
    private final AdvancedModelRenderer branch3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer wormbranch3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tentaclebranch5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tentaclebranch6;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer branch4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer wormbranch4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tentaclebranch7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tentaclebranch8;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer branch2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer wormbranch2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tentaclebranch3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tentaclebranch4;
    private final AdvancedModelRenderer cube_r24;

    public float scaler;

    public ModelGangtoucunia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -8.0F, 0.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 0, -1.8494F, -7.7858F, -1.0F, 2, 8, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -8.0F, -1.0F, 2, 8, 2, 0.001F, false));

        this.worm = new AdvancedModelRenderer(this);
        this.worm.setRotationPoint(-0.1399F, -12.8183F, 0.5F);
        this.main.addChild(worm);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.6399F, 4.8183F, 0.0F);
        this.worm.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -1.3494F, -8.2858F, -0.5F, 1, 7, 1, 0.001F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0963F, -3.4957F, -0.5F);
        this.worm.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.6983F, 0.0232F, 0.0121F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5436F, 8.314F, 0.5F);
        this.tentacle.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 11, -1.3494F, -10.2858F, -0.5F, 1, 2, 0, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.0963F, -3.4957F, 0.5F);
        this.worm.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.6983F, -0.0232F, 0.0121F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5436F, 8.314F, -0.5F);
        this.tentacle2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0436F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 21, -1.3494F, -10.2858F, 0.5F, 1, 2, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.6458F, -3.4739F, 0.0F);
        this.worm.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, 0.829F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0059F, 8.2922F, 0.0F);
        this.tentacle3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 4, -0.3494F, -10.2858F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-0.3411F, -3.5239F, 0.0F);
        this.worm.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, 0.0F, -0.829F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0059F, 8.2922F, 0.0F);
        this.tentacle4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 2, 0.3494F, -10.2858F, -0.5F, 0, 2, 1, 0.0F, false));

        this.branch = new AdvancedModelRenderer(this);
        this.branch.setRotationPoint(-0.5F, -11.0F, -0.5F);
        this.main.addChild(branch);
        this.setRotateAngle(branch, 0.0F, 0.0F, 0.5672F);
        this.branch.cubeList.add(new ModelBox(branch, 0, 21, -2.0F, 0.5F, 0.5F, 2, 1, 1, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.5F, 0.5F);
        this.branch.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 18, -1.6F, -0.1F, 0.0F, 2, 1, 1, 0.0F, false));

        this.wormbranch = new AdvancedModelRenderer(this);
        this.wormbranch.setRotationPoint(-2.7128F, 0.609F, 1.0F);
        this.branch.addChild(wormbranch);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7128F, -0.109F, -0.5F);
        this.wormbranch.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 16, -1.6F, -0.1F, 0.5F, 2, 1, 0, 0.0F, false));

        this.tentaclebranch = new AdvancedModelRenderer(this);
        this.tentaclebranch.setRotationPoint(-0.8626F, -0.4452F, 0.0F);
        this.wormbranch.addChild(tentaclebranch);
        this.setRotateAngle(tentaclebranch, 0.0F, -0.48F, 0.48F);
        this.tentaclebranch.cubeList.add(new ModelBox(tentaclebranch, 0, 24, -0.9746F, -0.4637F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentaclebranch2 = new AdvancedModelRenderer(this);
        this.tentaclebranch2.setRotationPoint(-0.8626F, -0.4452F, 0.0F);
        this.wormbranch.addChild(tentaclebranch2);
        this.setRotateAngle(tentaclebranch2, 0.0F, 0.48F, 0.48F);
        this.tentaclebranch2.cubeList.add(new ModelBox(tentaclebranch2, 23, 14, -0.9746F, -0.4637F, 0.0F, 1, 1, 0, 0.0F, false));

        this.branch3 = new AdvancedModelRenderer(this);
        this.branch3.setRotationPoint(-0.25F, -8.5334F, 1.3362F);
        this.main.addChild(branch3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2834F, 3.1638F);
        this.branch3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.4835F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 18, -0.5F, -2.0F, 2.975F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.462F, 1.4759F);
        this.branch3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.0908F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 6, -0.5F, -1.2F, -2.5F, 1, 1, 5, 0.001F, false));

        this.wormbranch3 = new AdvancedModelRenderer(this);
        this.wormbranch3.setRotationPoint(0.0F, -3.8072F, 2.016F);
        this.branch3.addChild(wormbranch3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 4.0906F, 1.1478F);
        this.wormbranch3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.4835F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 0, 0.5F, -2.0F, 2.975F, 0, 1, 2, 0.0F, false));

        this.tentaclebranch5 = new AdvancedModelRenderer(this);
        this.tentaclebranch5.setRotationPoint(0.0F, -0.9924F, 0.1743F);
        this.wormbranch3.addChild(tentaclebranch5);
        this.setRotateAngle(tentaclebranch5, -0.0501F, -0.0715F, -0.9581F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.001F, 0.0436F);
        this.tentaclebranch5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.5708F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 22, 0.0F, -0.6372F, -0.0038F, 0, 1, 1, 0.0F, false));

        this.tentaclebranch6 = new AdvancedModelRenderer(this);
        this.tentaclebranch6.setRotationPoint(0.0F, -0.9924F, 0.1743F);
        this.wormbranch3.addChild(tentaclebranch6);
        this.setRotateAngle(tentaclebranch6, -0.0532F, 0.0692F, 0.9145F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.001F, 0.0436F);
        this.tentaclebranch6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.5708F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 21, 0.0F, -0.6372F, -0.0038F, 0, 1, 1, 0.0F, false));

        this.branch4 = new AdvancedModelRenderer(this);
        this.branch4.setRotationPoint(-0.25F, -12.514F, -0.5139F);
        this.main.addChild(branch4);
        this.setRotateAngle(branch4, -1.0036F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.6525F, -5.3418F);
        this.branch4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 11, -0.5F, -0.975F, 2.5F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.1525F, -0.3418F);
        this.branch4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6545F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 16, -0.5F, -0.5F, -1.4F, 1, 1, 2, 0.001F, false));

        this.wormbranch4 = new AdvancedModelRenderer(this);
        this.wormbranch4.setRotationPoint(0.0F, 0.2481F, -1.9264F);
        this.branch4.addChild(wormbranch4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.9005F, -3.4154F);
        this.wormbranch4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 20, 0.0F, -0.975F, 2.5F, 0, 1, 2, 0.0F, false));

        this.tentaclebranch7 = new AdvancedModelRenderer(this);
        this.tentaclebranch7.setRotationPoint(0.0F, -0.474F, -0.8858F);
        this.wormbranch4.addChild(tentaclebranch7);
        this.setRotateAngle(tentaclebranch7, -0.5367F, 0.6248F, -0.3349F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentaclebranch7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 21, 0.0F, -0.401F, -1.0002F, 0, 1, 1, 0.0F, false));

        this.tentaclebranch8 = new AdvancedModelRenderer(this);
        this.tentaclebranch8.setRotationPoint(0.0F, -0.474F, -0.8858F);
        this.wormbranch4.addChild(tentaclebranch8);
        this.setRotateAngle(tentaclebranch8, -0.5934F, -0.7354F, 0.425F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentaclebranch8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 8, 0.0F, -0.401F, -1.0002F, 0, 1, 1, 0.0F, false));

        this.branch2 = new AdvancedModelRenderer(this);
        this.branch2.setRotationPoint(0.75F, -6.5F, 0.5F);
        this.main.addChild(branch2);
        this.setRotateAngle(branch2, 0.0F, 0.0F, -0.5672F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 0.5F, 0.5F);
        this.branch2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.7418F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 15, 0.775F, -0.575F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 1.5F, 0.0F);
        this.branch2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3054F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 13, 0.0F, -1.0F, -0.5F, 4, 1, 1, 0.001F, false));

        this.wormbranch2 = new AdvancedModelRenderer(this);
        this.wormbranch2.setRotationPoint(3.6266F, -1.0923F, 0.0F);
        this.branch2.addChild(wormbranch2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.6266F, 1.5923F, 0.5F);
        this.wormbranch2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.7418F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 0, 0.775F, -0.575F, -0.5F, 3, 1, 0, 0.0F, false));

        this.tentaclebranch3 = new AdvancedModelRenderer(this);
        this.tentaclebranch3.setRotationPoint(1.1118F, -1.0268F, 0.0F);
        this.wormbranch2.addChild(tentaclebranch3);
        this.setRotateAngle(tentaclebranch3, 0.7854F, 0.0F, 0.829F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentaclebranch3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -1.5708F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 20, -0.0134F, -0.4941F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentaclebranch4 = new AdvancedModelRenderer(this);
        this.tentaclebranch4.setRotationPoint(1.1118F, -1.0268F, 0.0F);
        this.wormbranch2.addChild(tentaclebranch4);
        this.setRotateAngle(tentaclebranch4, -0.829F, 0.0F, 0.829F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentaclebranch4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -1.5708F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 0, -0.0134F, -0.4941F, 0.0F, 1, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        //System.err.println(hidden);

        this.main.offsetY = 1.95F;

        this.worm.scaleChildren = true;
        this.wormbranch.scaleChildren = true;
        this.wormbranch2.scaleChildren = true;
        this.wormbranch3.scaleChildren = true;
        this.wormbranch4.scaleChildren = true;

        this.worm.setScale(this.scaler, this.scaler, this.scaler);
        this.wormbranch.setScale(this.scaler, this.scaler, this.scaler);
        this.wormbranch2.setScale(this.scaler, this.scaler, this.scaler);
        this.wormbranch3.setScale(this.scaler, this.scaler, this.scaler);
        this.wormbranch4.setScale(this.scaler, this.scaler, this.scaler);

        if (this.scaler > 0.05F) {

            float floatFlap = 0.4F;
            this.walk(tentacle, 0.18F, floatFlap, false, 2.50F, -0.135F, f, 1F);
            this.flap(tentacle3, 0.18F, -floatFlap, false, 0.25F, -0.15F, f, 1F);
            this.walk(tentacle2, 0.18F, -floatFlap, false, 2.75F, 0.135F, f, 1F);
            this.flap(tentacle4, 0.18F, floatFlap, false, 0, 0.15F, f, 1F);

            this.swing(tentaclebranch7, 0.12F, floatFlap, false, 1F, 0, f, 1F);
            this.swing(tentaclebranch8, 0.12F, -floatFlap, false, 1F, 0, f, 1F);

            this.swing(tentaclebranch, 0.14F, floatFlap, false, 1.5F, 0, f, 1F);
            this.swing(tentaclebranch2, 0.14F, -floatFlap, false, 1.5F, 0, f, 1F);

            this.flap(tentaclebranch5, 0.16F, floatFlap, false, 1.5F, 0, f, 1F);
            this.flap(tentaclebranch6, 0.16F, -floatFlap, false, 1.5F, 0, f, 1F);

            this.walk(tentaclebranch3, 0.20F, floatFlap, false, 1.5F, 0, f, 1F);
            this.walk(tentaclebranch4, 0.20F, -floatFlap, false, 1.5F, 0, f, 1F);

            float bob = this.moveBox(0.10F, 0.01F, false, f, 1F);
            this.worm.offsetY = this.worm.offsetY + bob;
        }
        this.main.render(0.019f);

    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
