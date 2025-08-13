package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMagnipterygius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelMagnipterygius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    private ModelAnimator animator;

    public ModelMagnipterygius() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.2833F, 2.225F);
        this.main.cubeList.add(new ModelBox(main, 23, 17, -2.5F, -4.2833F, -0.225F, 5, 8, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 17, -2.0F, -5.1833F, -1.825F, 4, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 38, 0.0F, -10.0333F, -3.7F, 0, 5, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 23, 0, -3.0F, -4.325F, -7.7F, 6, 8, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 30, -2.5F, -5.2F, -7.25F, 5, 1, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.575F, 2.45F, -5.875F);
        this.body.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0335F, -0.0806F, 0.394F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 64, 57, 0.0F, -0.3F, -1.5F, 2, 1, 2, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 42, 25, 0.0F, 0.3F, -1.5F, 6, 0, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.575F, 2.45F, -5.875F);
        this.body.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0335F, 0.0806F, -0.394F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 64, 57, -2.0F, -0.3F, -1.5F, 2, 1, 2, 0.0F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 42, 25, -6.0F, 0.3F, -1.5F, 6, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 51, 51, -2.0F, -3.95F, -2.125F, 4, 7, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.05F, -2.125F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 28, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.9305F, -2.1267F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4276F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 14, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.25F, -1.275F);
        this.head.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 53, 45, -1.5F, -1.475F, -3.825F, 3, 2, 3, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 53, -0.5F, -0.5F, -12.725F, 1, 1, 5, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 50, 61, 0.4F, -0.1F, -12.675F, 0, 1, 5, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 60, -1.0F, -0.5F, -7.75F, 2, 1, 4, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 64, 51, 0.95F, -0.1F, -7.7F, 0, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.725F, 0.225F, -2.15F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 43, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 57, -1.075F, -1.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 57, 1.525F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 43, 1.45F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, -4.025F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5323F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 38, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 66, -0.5F, 0.0F, -1.975F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.847F, -5.1112F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1527F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 0, -0.5F, 0.05F, -2.0F, 1, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, -0.675F);
        this.head2.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 60, -1.5F, 0.25F, -3.15F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 61, 61, -1.5F, -1.575F, -2.15F, 3, 2, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 57, -1.0F, 0.25F, -7.075F, 2, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 32, 0.9F, -0.15F, -7.025F, 0, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 7, -0.5F, 0.25F, -12.05F, 1, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 60, 0.425F, -0.15F, -12.0F, 0, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2499F, -2.9024F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2923F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 63, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 32, -2.0F, -3.525F, 0.5F, 4, 6, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.4552F, 5.3341F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2487F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 30, -2.0F, -2.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -5.1641F, -0.0783F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2313F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 7, -1.5F, 0.0F, 4.0F, 2, 2, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 0, -2.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.475F, 1.9F, 1.35F);
        this.tail.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0104F, -0.1225F, 0.2706F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 52, 14, 0.0F, -0.25F, -0.5F, 2, 1, 1, 0.0F, false));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 63, 25, 0.0F, 0.35F, -0.5F, 4, 0, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.475F, 1.9F, 1.35F);
        this.tail.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0104F, 0.1225F, -0.2706F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 52, 14, -2.0F, -0.25F, -0.5F, 2, 1, 1, 0.0F, true));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 63, 25, -4.0F, 0.35F, -0.5F, 4, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 38, -1.5F, -2.275F, 0.225F, 3, 3, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -3.7977F, 0.4737F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2574F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 48, -0.5F, 0.025F, -0.05F, 2, 2, 6, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.7087F, 6.1401F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 44, -1.5F, -2.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.2594F, 0.2177F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2487F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 65, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.675F, 0.025F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 19, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -9.35F, 0.2F, 0, 20, 11, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.9325F, 1.8207F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0821F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 51, -0.5F, 0.0F, 0.0F, 1, 1, 7, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.525F, 0.1F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.9599F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 38, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.778F, 0.4114F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 66, -0.5F, -0.675F, -1.4F, 1, 1, 3, -0.02F, false));

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
        this.main.offsetY = -0.25F;
        this.main.offsetX = 1.4F;
        this.main.offsetZ = 2.0F;
        this.main.scaleChildren = true;
        float scaler = 5.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, -0.0F);
        this.head.offsetY = -0F;
        this.head.offsetX = -0F;
        this.head.offsetZ = 0.008F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail4, 0.0F, -0.1178F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1353F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.144F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.1091F, 0.0F);
        this.setRotateAngle(rightLeg, -0.0248F, 0.1204F, -0.3892F);
        this.setRotateAngle(rightArm, -0.0159F, 0.0858F, -0.1839F);
        this.setRotateAngle(main, 0.1603F, -0.8396F, 0.1149F);
        this.setRotateAngle(leftLeg, -0.0378F, -0.117F, 0.499F);
        this.setRotateAngle(leftArm, -0.0263F, -0.0832F, 0.3065F);
        this.setRotateAngle(jaw, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.0F, 0.1047F, 0.0F);
        this.setRotateAngle(head, 0.0516F, 0.0656F, -0.0059F);
        this.setRotateAngle(cube_r9, -0.2574F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2313F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2487F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2923F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1527F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4276F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -1.0821F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2487F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0175F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Mixosaurus.offsetY = 1F;
        //this.Mixosaurus.offsetZ = 1.0F;
        if(e.isInWater()) {

            //this.Mixosaurus.offsetY = -0.2F;

        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] neckHead = {this.head};


        float speed = 0.24F;
        EntityPrehistoricFloraMagnipterygius ee = (EntityPrehistoricFloraMagnipterygius) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        ((EntityPrehistoricFloraMagnipterygius)e).tailBuffer.applyChainSwingBuffer(fishTail);

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        //if (e.isInWater()) {

         if(!e.isInWater()) {

             this.bob(main, -speed, 1.5F, false, f2, 1);

         }

         /*   if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            */
        //Animation values need tweaking
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(neckHead, speed * still, 0.15F, 0, f2, 0.5F *still);
        }

        //this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(leftArm, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftArm, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightArm, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightArm, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        this.flap(leftLeg, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftLeg, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightLeg, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightLeg, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        //}

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

//        animator.setAnimation(e.ROAR_ANIMATION);
//        animator.startKeyframe(5);
//        animator.move(this.head, 0,0,-0.2F);
//        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(5);
//        animator.resetKeyframe(2);

    }
}

