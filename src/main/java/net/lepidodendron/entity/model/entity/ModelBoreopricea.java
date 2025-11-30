package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBoreopricea;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBoreopricea extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelBoreopricea() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 18.4882F, 4.8918F);
        this.setRotateAngle(main, -0.2182F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 34, -1.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 2.0F, 1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 9, -2.5F, -0.75F, -2.0F, 3, 1, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, 1.0F, 0.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 9, -1.0F, -0.875F, 0.0F, 2, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1134F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 20, -0.5F, -0.775F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 26, -0.5F, -0.275F, 0.0F, 1, 1, 6, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2094F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, -0.525F, 0.0F, 1, 1, 8, -0.006F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 10, -0.5F, -0.525F, 0.0F, 1, 1, 8, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, 1.5F, 0.0F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.8538F, 0.1609F, -0.886F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 39, -0.5F, -0.5F, -1.0F, 1, 3, 2, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2629F, -0.1248F, 0.0396F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 13, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4557F, 4.3824F, 0.9217F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.86F, -0.1403F, -0.7948F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 11, 34, -0.5F, -0.5F, -1.5F, 1, 3, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.0F, 1.5F, 0.0F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.8538F, -0.1609F, 0.886F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 39, -0.5F, -0.5F, -1.0F, 1, 3, 2, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2629F, 0.1248F, -0.0396F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 13, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4557F, 4.3824F, 0.9217F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.86F, 0.1403F, 0.7948F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 11, 34, -0.5F, -0.5F, -1.5F, 1, 3, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 0.0F, -0.75F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 0, -2.0F, -0.15F, -5.0F, 4, 3, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.2F, -4.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 19, 18, -2.0F, -1.35F, -4.0F, 4, 3, 4, -0.006F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.25F, -3.3F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 28, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 1.625F, -1.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 26, -1.0F, 0.0F, -2.0F, 3, 1, 3, -0.003F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.5F, 1.4655F, -1.5156F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.239F, -0.0633F, 0.8023F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 20, 40, -0.5F, -0.25F, -0.85F, 1, 3, 1, -0.003F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 7, 41, -0.5F, -0.25F, -0.35F, 1, 3, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.175F, 2.2413F, 0.0042F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6695F, -0.075F, -0.5488F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 12, 41, -0.5736F, -0.1636F, -0.3468F, 1, 3, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0785F, 2.2998F, 0.2439F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4287F, 0.0741F, -0.2054F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.0712F, 0.3094F, -0.1472F);
        this.rightArm3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 5, -1.5F, -0.5F, -1.5F, 2, 1, 2, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.5F, 1.4655F, -1.5156F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.239F, 0.0633F, -0.8023F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 20, 40, -0.5F, -0.25F, -0.85F, 1, 3, 1, -0.003F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 7, 41, -0.5F, -0.25F, -0.35F, 1, 3, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.175F, 2.2413F, 0.0042F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6695F, 0.075F, 0.5488F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 12, 41, -0.4264F, -0.1636F, -0.3468F, 1, 3, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0785F, 2.2998F, 0.2439F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4287F, -0.0741F, 0.2054F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0712F, 0.3094F, -0.1472F);
        this.leftArm3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.48F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 5, -0.5F, -0.5F, -1.5F, 2, 1, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.05F, -2.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 31, -1.25F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 30, 31, -0.75F, 0.0F, -3.0F, 2, 2, 3, 0.003F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0049F, -0.0007F, -2.9803F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 21, -0.5049F, 0.2257F, -2.5197F, 1, 1, 3, -0.009F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0049F, -0.0569F, -0.9113F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 42, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8796F, 0.2257F, -2.6361F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5021F, -0.5187F, -0.162F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 13, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.58F, 0.7257F, 0.281F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2356F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 37, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8049F, 0.5225F, -1.4063F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0092F, -0.3054F, -0.0028F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 16, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.8699F, 0.2257F, -2.6361F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5021F, 0.5187F, 0.162F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 13, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5102F, 0.8257F, -2.0332F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0636F, -0.2347F, -0.0209F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 31, -0.175F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5004F, 0.8257F, -2.0332F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0679F, 0.2347F, 0.0209F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 31, 0.175F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5702F, 0.7257F, 0.281F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2356F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 37, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.7951F, 0.5225F, -1.4063F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0092F, 0.3054F, 0.0028F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 16, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0049F, -0.0482F, -1.9113F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0087F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 42, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0049F, 0.2525F, -2.865F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6545F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 42, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.0049F, -0.0482F, -1.9113F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 42, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0049F, 0.9F, 0.1F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 0, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 26, -0.5F, -0.75F, -1.25F, 1, 1, 1, -0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.3F, -2.775F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3447F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 20, 0.2F, -0.5F, 0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 37, 0.0F, -0.3F, 0.0F, 1, 1, 3, -0.003F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.3F, -2.775F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3447F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 20, -0.2F, -0.5F, 0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 37, -1.0F, -0.3F, 0.0F, 1, 1, 3, -0.006F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.70F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 1.F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(-10);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = 0.122F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraBoreopricea proteros = (EntityPrehistoricFloraBoreopricea) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBoreopricea ee = (EntityPrehistoricFloraBoreopricea) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBoreopricea entity = (EntityPrehistoricFloraBoreopricea) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (102.94758-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.25335-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (36.50736-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 102.94758 + (((tickAnim - 10) / 5) * (25.16518-(102.94758)));
            yy = -4.25335 + (((tickAnim - 10) / 5) * (-23.80604-(-4.25335)));
            zz = 36.50736 + (((tickAnim - 10) / 5) * (-27.90842-(36.50736)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.16518 + (((tickAnim - 15) / 5) * (0-(25.16518)));
            yy = -23.80604 + (((tickAnim - 15) / 5) * (0-(-23.80604)));
            zz = -27.90842 + (((tickAnim - 15) / 5) * (0-(-27.90842)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (102.94758-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-4.25335-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (36.50736-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 102.94758 + (((tickAnim - 30) / 5) * (25.16518-(102.94758)));
            yy = -4.25335 + (((tickAnim - 30) / 5) * (-23.80604-(-4.25335)));
            zz = 36.50736 + (((tickAnim - 30) / 5) * (-27.90842-(36.50736)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 25.16518 + (((tickAnim - 35) / 5) * (-7.25708-(25.16518)));
            yy = -23.80604 + (((tickAnim - 35) / 5) * (-16.13429-(-23.80604)));
            zz = -27.90842 + (((tickAnim - 35) / 5) * (23.88031-(-27.90842)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.25708 + (((tickAnim - 40) / 10) * (0-(-7.25708)));
            yy = -16.13429 + (((tickAnim - 40) / 10) * (0-(-16.13429)));
            zz = 23.88031 + (((tickAnim - 40) / 10) * (0-(23.88031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -31.5 + (((tickAnim - 10) / 2) * (-8-(-31.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -8 + (((tickAnim - 12) / 8) * (0-(-8)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -31.5 + (((tickAnim - 30) / 2) * (-8-(-31.5)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8 + (((tickAnim - 32) / 8) * (-36-(-8)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -36 + (((tickAnim - 40) / 10) * (0-(-36)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24.02816-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-30.43725-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.43068-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24.02816 + (((tickAnim - 5) / 5) * (45-(24.02816)));
            yy = -30.43725 + (((tickAnim - 5) / 5) * (0-(-30.43725)));
            zz = -0.43068 + (((tickAnim - 5) / 5) * (49-(-0.43068)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (46.77538-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.91255-(0)));
            zz = 49 + (((tickAnim - 10) / 2) * (35.91655-(49)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 46.77538 + (((tickAnim - 12) / 3) * (-41.17387-(46.77538)));
            yy = 3.91255 + (((tickAnim - 12) / 3) * (11.73766-(3.91255)));
            zz = 35.91655 + (((tickAnim - 12) / 3) * (9.74964-(35.91655)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -41.17387 + (((tickAnim - 15) / 5) * (0-(-41.17387)));
            yy = 11.73766 + (((tickAnim - 15) / 5) * (0-(11.73766)));
            zz = 9.74964 + (((tickAnim - 15) / 5) * (0-(9.74964)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (24.02816-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-30.43725-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.43068-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 24.02816 + (((tickAnim - 25) / 5) * (45-(24.02816)));
            yy = -30.43725 + (((tickAnim - 25) / 5) * (0-(-30.43725)));
            zz = -0.43068 + (((tickAnim - 25) / 5) * (49-(-0.43068)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 45 + (((tickAnim - 30) / 2) * (46.77538-(45)));
            yy = 0 + (((tickAnim - 30) / 2) * (3.91255-(0)));
            zz = 49 + (((tickAnim - 30) / 2) * (35.91655-(49)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 46.77538 + (((tickAnim - 32) / 3) * (-41.17387-(46.77538)));
            yy = 3.91255 + (((tickAnim - 32) / 3) * (11.73766-(3.91255)));
            zz = 35.91655 + (((tickAnim - 32) / 3) * (9.74964-(35.91655)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -41.17387 + (((tickAnim - 35) / 5) * (-19.70287-(-41.17387)));
            yy = 11.73766 + (((tickAnim - 35) / 5) * (39.28218-(11.73766)));
            zz = 9.74964 + (((tickAnim - 35) / 5) * (-25.95607-(9.74964)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.70287 + (((tickAnim - 40) / 10) * (0-(-19.70287)));
            yy = 39.28218 + (((tickAnim - 40) / 10) * (0-(39.28218)));
            zz = -25.95607 + (((tickAnim - 40) / 10) * (0-(-25.95607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 5) / 15) * (0-(0.725)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.725-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 25) / 15) * (0-(0.725)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBoreopricea entity = (EntityPrehistoricFloraBoreopricea) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
 if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.5 + (((tickAnim - 10) / 5) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 27.25 + (((tickAnim - 5) / 5) * (11.5-(27.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 10) / 5) * (0-(11.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.4 + (((tickAnim - 5) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 43.75 + (((tickAnim - 5) / 5) * (0-(43.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBoreopricea entity = (EntityPrehistoricFloraBoreopricea) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.35);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.35);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.35);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-65.5))*-2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-2))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15.40886 + (((tickAnim - 0) / 10) * (77.25-(-15.40886)));
            yy = -31.00701 + (((tickAnim - 0) / 10) * (0-(-31.00701)));
            zz = 20.94133 + (((tickAnim - 0) / 10) * (0-(20.94133)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 77.25 + (((tickAnim - 10) / 5) * (14.88183-(77.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (-30.67395-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-26.64187-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.88183 + (((tickAnim - 15) / 5) * (-15.40886-(14.88183)));
            yy = -30.67395 + (((tickAnim - 15) / 5) * (-31.00701-(-30.67395)));
            zz = -26.64187 + (((tickAnim - 15) / 5) * (20.94133-(-26.64187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.75 + (((tickAnim - 0) / 10) * (-9.64873-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.36121-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.54935-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -9.64873 + (((tickAnim - 10) / 2) * (6.59955-(-9.64873)));
            yy = -11.36121 + (((tickAnim - 10) / 2) * (-1.49802-(-11.36121)));
            zz = 2.54935 + (((tickAnim - 10) / 2) * (0.58528-(2.54935)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 6.59955 + (((tickAnim - 12) / 3) * (17.50108-(6.59955)));
            yy = -1.49802 + (((tickAnim - 12) / 3) * (8.24998-(-1.49802)));
            zz = 0.58528 + (((tickAnim - 12) / 3) * (-0.02033-(0.58528)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17.50108 + (((tickAnim - 15) / 3) * (-18.37446-(17.50108)));
            yy = 8.24998 + (((tickAnim - 15) / 3) * (4.12499-(8.24998)));
            zz = -0.02033 + (((tickAnim - 15) / 3) * (-0.01017-(-0.02033)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.37446 + (((tickAnim - 18) / 2) * (-5.75-(-18.37446)));
            yy = 4.12499 + (((tickAnim - 18) / 2) * (0-(4.12499)));
            zz = -0.01017 + (((tickAnim - 18) / 2) * (0-(-0.01017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.15 + (((tickAnim - 15) / 5) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -46.7407 + (((tickAnim - 0) / 5) * (-56.58777-(-46.7407)));
            yy = 26.93944 + (((tickAnim - 0) / 5) * (-13.18808-(26.93944)));
            zz = -30.72185 + (((tickAnim - 0) / 5) * (-18.31042-(-30.72185)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -56.58777 + (((tickAnim - 5) / 5) * (23.75132-(-56.58777)));
            yy = -13.18808 + (((tickAnim - 5) / 5) * (14.18811-(-13.18808)));
            zz = -18.31042 + (((tickAnim - 5) / 5) * (29.31904-(-18.31042)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23.75132 + (((tickAnim - 10) / 2) * (39.36336-(23.75132)));
            yy = 14.18811 + (((tickAnim - 10) / 2) * (26.54247-(14.18811)));
            zz = 29.31904 + (((tickAnim - 10) / 2) * (45.71632-(29.31904)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 39.36336 + (((tickAnim - 12) / 3) * (-5.00207-(39.36336)));
            yy = 26.54247 + (((tickAnim - 12) / 3) * (38.82663-(26.54247)));
            zz = 45.71632 + (((tickAnim - 12) / 3) * (21.27703-(45.71632)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.00207 + (((tickAnim - 15) / 3) * (-27.07953-(-5.00207)));
            yy = 38.82663 + (((tickAnim - 15) / 3) * (17.61091-(38.82663)));
            zz = 21.27703 + (((tickAnim - 15) / 3) * (-8.76865-(21.27703)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.07953 + (((tickAnim - 18) / 2) * (-46.7407-(-27.07953)));
            yy = 17.61091 + (((tickAnim - 18) / 2) * (26.93944-(17.61091)));
            zz = -8.76865 + (((tickAnim - 18) / 2) * (-30.72185-(-8.76865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.24-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.81-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.24 + (((tickAnim - 3) / 2) * (0.5-(-0.24)));
            yy = 0.81 + (((tickAnim - 3) / 2) * (0.65-(0.81)));
            zz = 0.23 + (((tickAnim - 3) / 2) * (0.475-(0.23)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 5) / 5) * (0-(0.5)));
            yy = 0.65 + (((tickAnim - 5) / 5) * (0-(0.65)));
            zz = 0.475 + (((tickAnim - 5) / 5) * (0-(0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 12) / 8) * (0-(-0.25)));
            yy = 0.125 + (((tickAnim - 12) / 8) * (-0.2-(0.125)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 77.25 + (((tickAnim - 0) / 5) * (14.88183-(77.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (30.67395-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (26.64187-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.88183 + (((tickAnim - 5) / 5) * (-15.40886-(14.88183)));
            yy = 30.67395 + (((tickAnim - 5) / 5) * (31.00701-(30.67395)));
            zz = 26.64187 + (((tickAnim - 5) / 5) * (-20.94133-(26.64187)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.40886 + (((tickAnim - 10) / 10) * (77.25-(-15.40886)));
            yy = 31.00701 + (((tickAnim - 10) / 10) * (0-(31.00701)));
            zz = -20.94133 + (((tickAnim - 10) / 10) * (0-(-20.94133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.64873 + (((tickAnim - 0) / 2) * (6.59955-(-9.64873)));
            yy = 11.36121 + (((tickAnim - 0) / 2) * (1.49802-(11.36121)));
            zz = -2.54935 + (((tickAnim - 0) / 2) * (-0.58528-(-2.54935)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 6.59955 + (((tickAnim - 2) / 3) * (17.50108-(6.59955)));
            yy = 1.49802 + (((tickAnim - 2) / 3) * (-8.24998-(1.49802)));
            zz = -0.58528 + (((tickAnim - 2) / 3) * (0.02033-(-0.58528)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.50108 + (((tickAnim - 5) / 3) * (-18.37446-(17.50108)));
            yy = -8.24998 + (((tickAnim - 5) / 3) * (-4.12499-(-8.24998)));
            zz = 0.02033 + (((tickAnim - 5) / 3) * (0.01017-(0.02033)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.37446 + (((tickAnim - 8) / 2) * (-5.75-(-18.37446)));
            yy = -4.12499 + (((tickAnim - 8) / 2) * (0-(-4.12499)));
            zz = 0.01017 + (((tickAnim - 8) / 2) * (0-(0.01017)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 10) / 10) * (-9.64873-(-5.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (11.36121-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-2.54935-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0.15 + (((tickAnim - 5) / 15) * (0-(0.15)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.75132 + (((tickAnim - 0) / 2) * (39.36336-(23.75132)));
            yy = -14.18811 + (((tickAnim - 0) / 2) * (-26.54247-(-14.18811)));
            zz = -29.31904 + (((tickAnim - 0) / 2) * (-45.71632-(-29.31904)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 39.36336 + (((tickAnim - 2) / 3) * (-5.00207-(39.36336)));
            yy = -26.54247 + (((tickAnim - 2) / 3) * (-38.82663-(-26.54247)));
            zz = -45.71632 + (((tickAnim - 2) / 3) * (-21.27703-(-45.71632)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5.00207 + (((tickAnim - 5) / 3) * (-27.07953-(-5.00207)));
            yy = -38.82663 + (((tickAnim - 5) / 3) * (-17.61091-(-38.82663)));
            zz = -21.27703 + (((tickAnim - 5) / 3) * (8.76865-(-21.27703)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.07953 + (((tickAnim - 8) / 2) * (-46.7407-(-27.07953)));
            yy = -17.61091 + (((tickAnim - 8) / 2) * (-26.93944-(-17.61091)));
            zz = 8.76865 + (((tickAnim - 8) / 2) * (30.72185-(8.76865)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -46.7407 + (((tickAnim - 10) / 5) * (-56.58777-(-46.7407)));
            yy = -26.93944 + (((tickAnim - 10) / 5) * (13.18808-(-26.93944)));
            zz = 30.72185 + (((tickAnim - 10) / 5) * (18.31042-(30.72185)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -56.58777 + (((tickAnim - 15) / 5) * (23.75132-(-56.58777)));
            yy = 13.18808 + (((tickAnim - 15) / 5) * (-14.18811-(13.18808)));
            zz = 18.31042 + (((tickAnim - 15) / 5) * (-29.31904-(18.31042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -0.25 + (((tickAnim - 2) / 8) * (0-(-0.25)));
            yy = 0.125 + (((tickAnim - 2) / 8) * (-0.2-(0.125)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.24-(0)));
            yy = -0.2 + (((tickAnim - 10) / 3) * (0.81-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.23-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.24 + (((tickAnim - 13) / 2) * (-0.5-(-0.24)));
            yy = 0.81 + (((tickAnim - 13) / 2) * (0.65-(0.81)));
            zz = 0.23 + (((tickAnim - 13) / 2) * (0.475-(0.23)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (0-(-0.5)));
            yy = 0.65 + (((tickAnim - 15) / 5) * (0-(0.65)));
            zz = 0.475 + (((tickAnim - 15) / 5) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*6), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-6));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*6));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -36.72915 + (((tickAnim - 0) / 10) * (64.89386-(-36.72915)));
            yy = -15.03684 + (((tickAnim - 0) / 10) * (-10.27915-(-15.03684)));
            zz = 6.29958 + (((tickAnim - 0) / 10) * (-38.66356-(6.29958)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 64.89386 + (((tickAnim - 10) / 4) * (-1.07551-(64.89386)));
            yy = -10.27915 + (((tickAnim - 10) / 4) * (-27.63583-(-10.27915)));
            zz = -38.66356 + (((tickAnim - 10) / 4) * (33.22788-(-38.66356)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -1.07551 + (((tickAnim - 14) / 1) * (-7.12649-(-1.07551)));
            yy = -27.63583 + (((tickAnim - 14) / 1) * (-27.62565-(-27.63583)));
            zz = 33.22788 + (((tickAnim - 14) / 1) * (33.28122-(33.22788)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.12649 + (((tickAnim - 15) / 5) * (-36.72915-(-7.12649)));
            yy = -27.62565 + (((tickAnim - 15) / 5) * (-15.03684-(-27.62565)));
            zz = 33.28122 + (((tickAnim - 15) / 5) * (6.29958-(33.28122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.52001 + (((tickAnim - 0) / 10) * (0-(-4.52001)));
            yy = 41.30242 + (((tickAnim - 0) / 10) * (0-(41.30242)));
            zz = -15.45683 + (((tickAnim - 0) / 10) * (-7.5-(-15.45683)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-54.71613-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (25.25129-(0)));
            zz = -7.5 + (((tickAnim - 10) / 5) * (-53.2647-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -54.71613 + (((tickAnim - 15) / 3) * (-54.71613-(-54.71613)));
            yy = 25.25129 + (((tickAnim - 15) / 3) * (25.25129-(25.25129)));
            zz = -53.2647 + (((tickAnim - 15) / 3) * (-53.2647-(-53.2647)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -54.71613 + (((tickAnim - 18) / 2) * (-4.52001-(-54.71613)));
            yy = 25.25129 + (((tickAnim - 18) / 2) * (41.30242-(25.25129)));
            zz = -53.2647 + (((tickAnim - 18) / 2) * (-15.45683-(-53.2647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 10) * (0-(-0.3)));
            zz = -0.25 + (((tickAnim - 0) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 21.22696 + (((tickAnim - 0) / 5) * (-16.26152-(21.22696)));
            yy = -8.79855 + (((tickAnim - 0) / 5) * (-4.39927-(-8.79855)));
            zz = 8.53181 + (((tickAnim - 0) / 5) * (4.2659-(8.53181)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.26152 + (((tickAnim - 5) / 5) * (58.75-(-16.26152)));
            yy = -4.39927 + (((tickAnim - 5) / 5) * (0-(-4.39927)));
            zz = 4.2659 + (((tickAnim - 5) / 5) * (0-(4.2659)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 58.75 + (((tickAnim - 10) / 2) * (129.49616-(58.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.46642-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-1.42197-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 129.49616 + (((tickAnim - 12) / 3) * (105.98848-(129.49616)));
            yy = 1.46642 + (((tickAnim - 12) / 3) * (-4.39927-(1.46642)));
            zz = -1.42197 + (((tickAnim - 12) / 3) * (4.2659-(-1.42197)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 105.98848 + (((tickAnim - 15) / 3) * (105.98848-(105.98848)));
            yy = -4.39927 + (((tickAnim - 15) / 3) * (-4.39927-(-4.39927)));
            zz = 4.2659 + (((tickAnim - 15) / 3) * (4.2659-(4.2659)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 105.98848 + (((tickAnim - 18) / 2) * (21.22696-(105.98848)));
            yy = -4.39927 + (((tickAnim - 18) / 2) * (-8.79855-(-4.39927)));
            zz = 4.2659 + (((tickAnim - 18) / 2) * (8.53181-(4.2659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
            zz = 0.125 + (((tickAnim - 0) / 5) * (-0.02-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0-(0.35)));
            zz = -0.02 + (((tickAnim - 5) / 5) * (-0.175-(-0.02)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 10) / 10) * (0.125-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-6), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*6));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 64.89386 + (((tickAnim - 0) / 5) * (-13.74114-(64.89386)));
            yy = 10.27915 + (((tickAnim - 0) / 5) * (28.23934-(10.27915)));
            zz = 38.66356 + (((tickAnim - 0) / 5) * (-45.88331-(38.66356)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.74114 + (((tickAnim - 5) / 5) * (-36.72915-(-13.74114)));
            yy = 28.23934 + (((tickAnim - 5) / 5) * (15.03684-(28.23934)));
            zz = -45.88331 + (((tickAnim - 5) / 5) * (-6.29958-(-45.88331)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -36.72915 + (((tickAnim - 10) / 10) * (64.89386-(-36.72915)));
            yy = 15.03684 + (((tickAnim - 10) / 10) * (10.27915-(15.03684)));
            zz = -6.29958 + (((tickAnim - 10) / 10) * (38.66356-(-6.29958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-54.71613-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-25.25129-(0)));
            zz = -7.5 + (((tickAnim - 0) / 5) * (53.2647-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -54.71613 + (((tickAnim - 5) / 3) * (-54.71613-(-54.71613)));
            yy = -25.25129 + (((tickAnim - 5) / 3) * (-25.25129-(-25.25129)));
            zz = 53.2647 + (((tickAnim - 5) / 3) * (53.2647-(53.2647)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -54.71613 + (((tickAnim - 8) / 2) * (-4.52001-(-54.71613)));
            yy = -25.25129 + (((tickAnim - 8) / 2) * (-41.30242-(-25.25129)));
            zz = 53.2647 + (((tickAnim - 8) / 2) * (15.45683-(53.2647)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.52001 + (((tickAnim - 10) / 10) * (0-(-4.52001)));
            yy = -41.30242 + (((tickAnim - 10) / 10) * (0-(-41.30242)));
            zz = 15.45683 + (((tickAnim - 10) / 10) * (-7.5-(15.45683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 10) * (0-(-0.3)));
            zz = -0.25 + (((tickAnim - 10) / 10) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 58.75 + (((tickAnim - 0) / 2) * (129.49616-(58.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.46642-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.42197-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 129.49616 + (((tickAnim - 2) / 3) * (105.98848-(129.49616)));
            yy = 1.46642 + (((tickAnim - 2) / 3) * (4.39927-(1.46642)));
            zz = -1.42197 + (((tickAnim - 2) / 3) * (-4.2659-(-1.42197)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 105.98848 + (((tickAnim - 5) / 3) * (66.23848-(105.98848)));
            yy = 4.39927 + (((tickAnim - 5) / 3) * (4.39927-(4.39927)));
            zz = -4.2659 + (((tickAnim - 5) / 3) * (-4.2659-(-4.2659)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66.23848 + (((tickAnim - 8) / 2) * (21.22696-(66.23848)));
            yy = 4.39927 + (((tickAnim - 8) / 2) * (8.79855-(4.39927)));
            zz = -4.2659 + (((tickAnim - 8) / 2) * (-8.53181-(-4.2659)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.22696 + (((tickAnim - 10) / 5) * (-16.26152-(21.22696)));
            yy = 8.79855 + (((tickAnim - 10) / 5) * (4.39927-(8.79855)));
            zz = -8.53181 + (((tickAnim - 10) / 5) * (-4.2659-(-8.53181)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -16.26152 + (((tickAnim - 15) / 5) * (58.75-(-16.26152)));
            yy = 4.39927 + (((tickAnim - 15) / 5) * (0-(4.39927)));
            zz = -4.2659 + (((tickAnim - 15) / 5) * (0-(-4.2659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 0) / 10) * (0.125-(-0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.35-(0)));
            zz = 0.125 + (((tickAnim - 10) / 5) * (-0.02-(0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 5) * (0-(0.35)));
            zz = -0.02 + (((tickAnim - 15) / 5) * (-0.175-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBoreopricea entity = (EntityPrehistoricFloraBoreopricea) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*12), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-65.5))*-2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*12), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-2))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*14), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*18), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*22), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.40886 + (((tickAnim - 0) / 5) * (77.25-(-15.40886)));
            yy = -31.00701 + (((tickAnim - 0) / 5) * (0-(-31.00701)));
            zz = 20.94133 + (((tickAnim - 0) / 5) * (0-(20.94133)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 77.25 + (((tickAnim - 5) / 3) * (14.88183-(77.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (-30.67395-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-26.64187-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.88183 + (((tickAnim - 8) / 2) * (-15.40886-(14.88183)));
            yy = -30.67395 + (((tickAnim - 8) / 2) * (-31.00701-(-30.67395)));
            zz = -26.64187 + (((tickAnim - 8) / 2) * (20.94133-(-26.64187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.75 + (((tickAnim - 0) / 5) * (-9.64873-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-11.36121-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.54935-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -9.64873 + (((tickAnim - 5) / 1) * (6.59955-(-9.64873)));
            yy = -11.36121 + (((tickAnim - 5) / 1) * (-1.49802-(-11.36121)));
            zz = 2.54935 + (((tickAnim - 5) / 1) * (0.58528-(2.54935)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.59955 + (((tickAnim - 6) / 2) * (17.50108-(6.59955)));
            yy = -1.49802 + (((tickAnim - 6) / 2) * (8.24998-(-1.49802)));
            zz = 0.58528 + (((tickAnim - 6) / 2) * (-0.02033-(0.58528)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 17.50108 + (((tickAnim - 8) / 1) * (-18.37446-(17.50108)));
            yy = 8.24998 + (((tickAnim - 8) / 1) * (4.12499-(8.24998)));
            zz = -0.02033 + (((tickAnim - 8) / 1) * (-0.01017-(-0.02033)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -18.37446 + (((tickAnim - 9) / 1) * (-5.75-(-18.37446)));
            yy = 4.12499 + (((tickAnim - 9) / 1) * (0-(4.12499)));
            zz = -0.01017 + (((tickAnim - 9) / 1) * (0-(-0.01017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.15 + (((tickAnim - 8) / 2) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -46.7407 + (((tickAnim - 0) / 3) * (-56.58777-(-46.7407)));
            yy = 26.93944 + (((tickAnim - 0) / 3) * (-13.18808-(26.93944)));
            zz = -30.72185 + (((tickAnim - 0) / 3) * (-18.31042-(-30.72185)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -56.58777 + (((tickAnim - 3) / 2) * (23.75132-(-56.58777)));
            yy = -13.18808 + (((tickAnim - 3) / 2) * (14.18811-(-13.18808)));
            zz = -18.31042 + (((tickAnim - 3) / 2) * (29.31904-(-18.31042)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.75132 + (((tickAnim - 5) / 1) * (39.36336-(23.75132)));
            yy = 14.18811 + (((tickAnim - 5) / 1) * (26.54247-(14.18811)));
            zz = 29.31904 + (((tickAnim - 5) / 1) * (45.71632-(29.31904)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 39.36336 + (((tickAnim - 6) / 2) * (-5.00207-(39.36336)));
            yy = 26.54247 + (((tickAnim - 6) / 2) * (38.82663-(26.54247)));
            zz = 45.71632 + (((tickAnim - 6) / 2) * (21.27703-(45.71632)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5.00207 + (((tickAnim - 8) / 1) * (-27.07953-(-5.00207)));
            yy = 38.82663 + (((tickAnim - 8) / 1) * (17.61091-(38.82663)));
            zz = 21.27703 + (((tickAnim - 8) / 1) * (-8.76865-(21.27703)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -27.07953 + (((tickAnim - 9) / 1) * (-46.7407-(-27.07953)));
            yy = 17.61091 + (((tickAnim - 9) / 1) * (26.93944-(17.61091)));
            zz = -8.76865 + (((tickAnim - 9) / 1) * (-30.72185-(-8.76865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.24-(0)));
            yy = -0.2 + (((tickAnim - 0) / 2) * (0.81-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.23-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.24 + (((tickAnim - 2) / 1) * (0.5-(-0.24)));
            yy = 0.81 + (((tickAnim - 2) / 1) * (0.65-(0.81)));
            zz = 0.23 + (((tickAnim - 2) / 1) * (0.475-(0.23)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
            yy = 0.65 + (((tickAnim - 3) / 2) * (0-(0.65)));
            zz = 0.475 + (((tickAnim - 3) / 2) * (0-(0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.25 + (((tickAnim - 6) / 4) * (0-(-0.25)));
            yy = 0.125 + (((tickAnim - 6) / 4) * (-0.2-(0.125)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 77.25 + (((tickAnim - 0) / 3) * (14.88183-(77.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (30.67395-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (26.64187-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14.88183 + (((tickAnim - 3) / 2) * (-15.40886-(14.88183)));
            yy = 30.67395 + (((tickAnim - 3) / 2) * (31.00701-(30.67395)));
            zz = 26.64187 + (((tickAnim - 3) / 2) * (-20.94133-(26.64187)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.40886 + (((tickAnim - 5) / 5) * (77.25-(-15.40886)));
            yy = 31.00701 + (((tickAnim - 5) / 5) * (0-(31.00701)));
            zz = -20.94133 + (((tickAnim - 5) / 5) * (0-(-20.94133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.64873 + (((tickAnim - 0) / 1) * (6.59955-(-9.64873)));
            yy = 11.36121 + (((tickAnim - 0) / 1) * (1.49802-(11.36121)));
            zz = -2.54935 + (((tickAnim - 0) / 1) * (-0.58528-(-2.54935)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 6.59955 + (((tickAnim - 1) / 2) * (17.50108-(6.59955)));
            yy = 1.49802 + (((tickAnim - 1) / 2) * (-8.24998-(1.49802)));
            zz = -0.58528 + (((tickAnim - 1) / 2) * (0.02033-(-0.58528)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 17.50108 + (((tickAnim - 3) / 1) * (-18.37446-(17.50108)));
            yy = -8.24998 + (((tickAnim - 3) / 1) * (-4.12499-(-8.24998)));
            zz = 0.02033 + (((tickAnim - 3) / 1) * (0.01017-(0.02033)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -18.37446 + (((tickAnim - 4) / 1) * (-5.75-(-18.37446)));
            yy = -4.12499 + (((tickAnim - 4) / 1) * (0-(-4.12499)));
            zz = 0.01017 + (((tickAnim - 4) / 1) * (0-(0.01017)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.75 + (((tickAnim - 5) / 5) * (-9.64873-(-5.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (11.36121-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.54935-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.15 + (((tickAnim - 3) / 7) * (0-(0.15)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 23.75132 + (((tickAnim - 0) / 1) * (39.36336-(23.75132)));
            yy = -14.18811 + (((tickAnim - 0) / 1) * (-26.54247-(-14.18811)));
            zz = -29.31904 + (((tickAnim - 0) / 1) * (-45.71632-(-29.31904)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 39.36336 + (((tickAnim - 1) / 2) * (-5.00207-(39.36336)));
            yy = -26.54247 + (((tickAnim - 1) / 2) * (-38.82663-(-26.54247)));
            zz = -45.71632 + (((tickAnim - 1) / 2) * (-21.27703-(-45.71632)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.00207 + (((tickAnim - 3) / 1) * (-27.07953-(-5.00207)));
            yy = -38.82663 + (((tickAnim - 3) / 1) * (-17.61091-(-38.82663)));
            zz = -21.27703 + (((tickAnim - 3) / 1) * (8.76865-(-21.27703)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -27.07953 + (((tickAnim - 4) / 1) * (-46.7407-(-27.07953)));
            yy = -17.61091 + (((tickAnim - 4) / 1) * (-26.93944-(-17.61091)));
            zz = 8.76865 + (((tickAnim - 4) / 1) * (30.72185-(8.76865)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -46.7407 + (((tickAnim - 5) / 3) * (-56.58777-(-46.7407)));
            yy = -26.93944 + (((tickAnim - 5) / 3) * (13.18808-(-26.93944)));
            zz = 30.72185 + (((tickAnim - 5) / 3) * (18.31042-(30.72185)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.58777 + (((tickAnim - 8) / 2) * (23.75132-(-56.58777)));
            yy = 13.18808 + (((tickAnim - 8) / 2) * (-14.18811-(13.18808)));
            zz = 18.31042 + (((tickAnim - 8) / 2) * (-29.31904-(18.31042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 1) / 4) * (0-(-0.25)));
            yy = 0.125 + (((tickAnim - 1) / 4) * (-0.2-(0.125)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-0.24-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0.81-(-0.2)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.23-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.24 + (((tickAnim - 7) / 1) * (-0.5-(-0.24)));
            yy = 0.81 + (((tickAnim - 7) / 1) * (0.65-(0.81)));
            zz = 0.23 + (((tickAnim - 7) / 1) * (0.475-(0.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
            yy = 0.65 + (((tickAnim - 8) / 2) * (0-(0.65)));
            zz = 0.475 + (((tickAnim - 8) / 2) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-12), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*12), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-6));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*12), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*6));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.72915 + (((tickAnim - 0) / 5) * (64.89386-(-36.72915)));
            yy = -15.03684 + (((tickAnim - 0) / 5) * (-10.27915-(-15.03684)));
            zz = 6.29958 + (((tickAnim - 0) / 5) * (-38.66356-(6.29958)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 64.89386 + (((tickAnim - 5) / 3) * (-7.12649-(64.89386)));
            yy = -10.27915 + (((tickAnim - 5) / 3) * (-27.62565-(-10.27915)));
            zz = -38.66356 + (((tickAnim - 5) / 3) * (33.28122-(-38.66356)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.12649 + (((tickAnim - 8) / 2) * (-36.72915-(-7.12649)));
            yy = -27.62565 + (((tickAnim - 8) / 2) * (-15.03684-(-27.62565)));
            zz = 33.28122 + (((tickAnim - 8) / 2) * (6.29958-(33.28122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.52001 + (((tickAnim - 0) / 5) * (0-(-4.52001)));
            yy = 41.30242 + (((tickAnim - 0) / 5) * (0-(41.30242)));
            zz = -15.45683 + (((tickAnim - 0) / 5) * (-7.5-(-15.45683)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-54.71613-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (25.25129-(0)));
            zz = -7.5 + (((tickAnim - 5) / 3) * (-53.2647-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -54.71613 + (((tickAnim - 8) / 1) * (-54.71613-(-54.71613)));
            yy = 25.25129 + (((tickAnim - 8) / 1) * (25.25129-(25.25129)));
            zz = -53.2647 + (((tickAnim - 8) / 1) * (-53.2647-(-53.2647)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -54.71613 + (((tickAnim - 9) / 1) * (-4.52001-(-54.71613)));
            yy = 25.25129 + (((tickAnim - 9) / 1) * (41.30242-(25.25129)));
            zz = -53.2647 + (((tickAnim - 9) / 1) * (-15.45683-(-53.2647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 5) * (0-(-0.3)));
            zz = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.30637 + (((tickAnim - 0) / 3) * (-16.36241-(13.30637)));
            yy = -11.88352 + (((tickAnim - 0) / 3) * (-5.54909-(-11.88352)));
            zz = 12.48953 + (((tickAnim - 0) / 3) * (12.18362-(12.48953)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.36241 + (((tickAnim - 3) / 2) * (58.75-(-16.36241)));
            yy = -5.54909 + (((tickAnim - 3) / 2) * (0-(-5.54909)));
            zz = 12.18362 + (((tickAnim - 3) / 2) * (0-(12.18362)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 58.75 + (((tickAnim - 5) / 1) * (129.49616-(58.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (1.46642-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-1.42197-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 129.49616 + (((tickAnim - 6) / 2) * (105.98848-(129.49616)));
            yy = 1.46642 + (((tickAnim - 6) / 2) * (-4.39927-(1.46642)));
            zz = -1.42197 + (((tickAnim - 6) / 2) * (4.2659-(-1.42197)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 105.98848 + (((tickAnim - 8) / 1) * (105.98848-(105.98848)));
            yy = -4.39927 + (((tickAnim - 8) / 1) * (-4.39927-(-4.39927)));
            zz = 4.2659 + (((tickAnim - 8) / 1) * (4.2659-(4.2659)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 105.98848 + (((tickAnim - 9) / 1) * (13.30637-(105.98848)));
            yy = -4.39927 + (((tickAnim - 9) / 1) * (-11.88352-(-4.39927)));
            zz = 4.2659 + (((tickAnim - 9) / 1) * (12.48953-(4.2659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 3) * (0.575-(0.525)));
            zz = 0.125 + (((tickAnim - 0) / 3) * (-0.02-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 2) * (0-(0.575)));
            zz = -0.02 + (((tickAnim - 3) / 2) * (-0.175-(-0.02)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.525-(0)));
            zz = -0.175 + (((tickAnim - 5) / 5) * (0.125-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-9), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*6));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-450))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 64.89386 + (((tickAnim - 0) / 3) * (-13.74114-(64.89386)));
            yy = 10.27915 + (((tickAnim - 0) / 3) * (28.23934-(10.27915)));
            zz = 38.66356 + (((tickAnim - 0) / 3) * (-45.88331-(38.66356)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.74114 + (((tickAnim - 3) / 2) * (-36.72915-(-13.74114)));
            yy = 28.23934 + (((tickAnim - 3) / 2) * (15.03684-(28.23934)));
            zz = -45.88331 + (((tickAnim - 3) / 2) * (-6.29958-(-45.88331)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -36.72915 + (((tickAnim - 5) / 5) * (64.89386-(-36.72915)));
            yy = 15.03684 + (((tickAnim - 5) / 5) * (10.27915-(15.03684)));
            zz = -6.29958 + (((tickAnim - 5) / 5) * (38.66356-(-6.29958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-54.71613-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-25.25129-(0)));
            zz = -7.5 + (((tickAnim - 0) / 3) * (53.2647-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -54.71613 + (((tickAnim - 3) / 1) * (-54.71613-(-54.71613)));
            yy = -25.25129 + (((tickAnim - 3) / 1) * (-25.25129-(-25.25129)));
            zz = 53.2647 + (((tickAnim - 3) / 1) * (53.2647-(53.2647)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -54.71613 + (((tickAnim - 4) / 1) * (-4.52001-(-54.71613)));
            yy = -25.25129 + (((tickAnim - 4) / 1) * (-41.30242-(-25.25129)));
            zz = 53.2647 + (((tickAnim - 4) / 1) * (15.45683-(53.2647)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.52001 + (((tickAnim - 5) / 5) * (0-(-4.52001)));
            yy = -41.30242 + (((tickAnim - 5) / 5) * (0-(-41.30242)));
            zz = 15.45683 + (((tickAnim - 5) / 5) * (-7.5-(15.45683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 5) / 5) * (0-(-0.3)));
            zz = -0.25 + (((tickAnim - 5) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.75 + (((tickAnim - 0) / 1) * (129.49616-(58.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.46642-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.42197-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 129.49616 + (((tickAnim - 1) / 2) * (105.98848-(129.49616)));
            yy = 1.46642 + (((tickAnim - 1) / 2) * (4.39927-(1.46642)));
            zz = -1.42197 + (((tickAnim - 1) / 2) * (-4.2659-(-1.42197)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 105.98848 + (((tickAnim - 3) / 1) * (66.23848-(105.98848)));
            yy = 4.39927 + (((tickAnim - 3) / 1) * (4.39927-(4.39927)));
            zz = -4.2659 + (((tickAnim - 3) / 1) * (-4.2659-(-4.2659)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 66.23848 + (((tickAnim - 4) / 1) * (13.30637-(66.23848)));
            yy = 4.39927 + (((tickAnim - 4) / 1) * (11.88352-(4.39927)));
            zz = -4.2659 + (((tickAnim - 4) / 1) * (-12.48953-(-4.2659)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.30637 + (((tickAnim - 5) / 3) * (-16.26152-(13.30637)));
            yy = 11.88352 + (((tickAnim - 5) / 3) * (4.39927-(11.88352)));
            zz = -12.48953 + (((tickAnim - 5) / 3) * (-4.2659-(-12.48953)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.26152 + (((tickAnim - 8) / 2) * (58.75-(-16.26152)));
            yy = 4.39927 + (((tickAnim - 8) / 2) * (0-(4.39927)));
            zz = -4.2659 + (((tickAnim - 8) / 2) * (0-(-4.2659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
            zz = -0.175 + (((tickAnim - 0) / 5) * (0.125-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 5) / 3) * (0.35-(0.525)));
            zz = 0.125 + (((tickAnim - 5) / 3) * (-0.02-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 2) * (0-(0.35)));
            zz = -0.02 + (((tickAnim - 8) / 2) * (-0.175-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBoreopricea e = (EntityPrehistoricFloraBoreopricea) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
