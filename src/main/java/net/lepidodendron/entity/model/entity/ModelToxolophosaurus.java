package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraToxolophosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelToxolophosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer pelvis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer Leftfoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer Rightfoot;

    private ModelAnimator animator;

    public ModelToxolophosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.pelvis = new AdvancedModelRenderer(this);
        this.pelvis.setRotationPoint(0.0F, 19.7F, 9.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 24, -2.0F, 3.0F, -0.2F, 4, 1, 3, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 50, 0.0F, -0.2F, -0.2F, 0, 1, 3, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 0, -2.0F, 0.3F, -0.2F, 4, 3, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2269F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 9, -2.6F, 1.5F, 0.1F, 1, 0, 3, -0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 9, 1.6F, 1.5F, 0.1F, 1, 0, 3, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 3.0F, 2.1F);
        this.pelvis.addChild(tail1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 43, 0.0F, -2.6794F, -0.0523F, 0, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 16, -1.5F, -2.1794F, -0.0523F, 3, 3, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 34, -2.0F, -0.5794F, -0.0523F, 1, 0, 4, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 34, 1.0F, -0.5794F, -0.0523F, 1, 0, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.1F);
        this.tail1.addChild(tail2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 34, 0.0F, -1.8308F, -0.3371F, 0, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 10, -1.5F, -0.2308F, 0.3629F, 1, 0, 4, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 10, 0.5F, -0.2308F, 0.3629F, 1, 0, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -1.0F, -1.2308F, -0.3371F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4871F, 3.4659F);
        this.tail2.addChild(tail3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 29, -0.8F, -0.3308F, -0.3371F, 1, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, -0.8F, -0.9308F, -0.3371F, 1, 1, 5, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 42, 0.0F, -1.3308F, 1.4629F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 5, -1.2F, -0.1308F, 1.6629F, 1, 0, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 5, 0.2F, -0.1308F, 1.6629F, 1, 0, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 36, -0.2F, -0.9308F, 0.6629F, 1, 1, 4, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, -0.2F, -0.3308F, 0.6629F, 1, 1, 4, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2129F, 4.7341F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 48, -0.5F, -0.6F, -0.6F, 1, 1, 3, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 45, 0.0F, -1.0F, 0.2F, 0, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, -0.3F);
        this.pelvis.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.8F, -5.7F, 4, 4, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 22, 1.7F, -0.7F, -5.0F, 1, 0, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 22, -2.7F, -0.7F, -5.0F, 1, 0, 5, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 42, 0.0F, -2.4F, -3.7F, 0, 1, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 11, -2.0F, -1.8F, -4.7F, 4, 4, 5, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.136F, -4.4241F);
        this.chest.addChild(neck);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4538F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 16, -1.5F, -2.3F, 0.0F, 3, 2, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.764F, -1.6759F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 36, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.464F, -1.6759F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 47, 0, -0.5F, -0.5F, -4.6F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 41, -1.5F, -0.5F, -1.8F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 41, -1.5F, -1.3F, -1.8F, 3, 1, 2, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.5F, -4.6F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2553F, -0.35F, 0.0188F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 32, 0.1F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 49, 0.0F, -0.2F, 1.2F, 1, 1, 1, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.5F, -4.6F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2553F, 0.35F, -0.0188F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 37, -1.1F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 49, -1.0F, -0.2F, 1.2F, 1, 1, 1, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.5F, -4.6F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 47, 15, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.5F, -4.6F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 15, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5F, -4.6F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 20, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, -0.4F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 39, -1.5F, -0.6F, -1.4F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 43, -0.5F, -0.6F, -4.2F, 1, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.3F, -4.2F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 45, 0.01F, 0.7F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -1.3F, -4.2F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3491F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 45, -1.01F, 0.7F, 0.0F, 1, 1, 3, -0.02F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.6634F, 0.7879F, -3.2599F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0441F, -0.4839F, 0.1573F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 41, 28, 0.1589F, -0.3843F, -1.1352F, 3, 1, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.9356F, 0.3032F, -0.0605F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.4368F, 1.2295F, 0.4503F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 9, 50, -0.1767F, -0.6874F, -0.1746F, 3, 1, 1, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 27, 49, -0.1767F, -0.6874F, -0.9746F, 3, 1, 1, 0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.2025F, 0.075F, 0.4108F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1005F, 0.1763F, -0.2958F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 21, 7, -0.3792F, 0.0375F, -1.9855F, 4, 0, 3, 0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.6634F, 0.7879F, -3.2599F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0441F, 0.4839F, -0.1573F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 41, 28, -3.1589F, -0.3843F, -1.1352F, 3, 1, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.9356F, 0.3032F, -0.0605F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.4368F, -1.2295F, -0.4503F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 9, 50, -2.8233F, -0.6874F, -0.1746F, 3, 1, 1, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 27, 49, -2.8233F, -0.6874F, -0.9746F, 3, 1, 1, 0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.2025F, 0.075F, 0.4108F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1005F, -0.1763F, 0.2958F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 21, 7, -3.6208F, 0.0375F, -1.9855F, 4, 0, 3, 0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.9F, 2.4F, 1.6F);
        this.pelvis.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1431F, 0.5125F, 0.0381F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 36, 6, -0.2F, -0.4F, -1.6F, 4, 1, 2, 0.01F, false));
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 47, 25, -0.2F, -0.4F, 0.3F, 4, 1, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.5F, 0.0F, -0.2F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.2664F, -0.9242F, 0.2782F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 26, 29, 0.0917F, -0.3751F, -1.4007F, 4, 1, 3, 0.0F, false));

        this.Leftfoot = new AdvancedModelRenderer(this);
        this.Leftfoot.setRotationPoint(3.9917F, 0.4249F, 0.7993F);
        this.leftLeg2.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.1242F, 0.0334F, -0.3129F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 19, 11, -0.5F, 0.0F, -3.1F, 5, 0, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.9F, 2.4F, 1.6F);
        this.pelvis.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1431F, -0.5125F, -0.0381F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 36, 6, -3.8F, -0.4F, -1.6F, 4, 1, 2, 0.01F, true));
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 47, 25, -3.8F, -0.4F, 0.3F, 4, 1, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.5F, 0.0F, -0.2F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.2664F, 0.9242F, -0.2782F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 26, 29, -4.0917F, -0.3751F, -1.4007F, 4, 1, 3, 0.0F, true));

        this.Rightfoot = new AdvancedModelRenderer(this);
        this.Rightfoot.setRotationPoint(-3.9917F, 0.4249F, 0.7993F);
        this.rightLeg2.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.1242F, -0.0334F, 0.3129F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 19, 11, -4.5F, 0.0F, -3.1F, 5, 0, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.pelvis.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.pelvis.offsetY = -2.5F;
        this.pelvis.offsetX = -0.3F;
        this.pelvis.rotateAngleY = (float)Math.toRadians(200);
        this.pelvis.rotateAngleX = (float)Math.toRadians(20);
        this.pelvis.rotateAngleZ = (float)Math.toRadians(-8);
        this.pelvis.scaleChildren = true;
        float scaler = 3.2F;
        this.pelvis.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.pelvis.render(f);
        //Reset rotations, positions and sizing:
        this.pelvis.setScale(1.0F, 1.0F, 1.0F);
        this.pelvis.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraToxolophosaurus ee = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.DIG_ANIMATION) {
            animDig(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animDig(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        }

    public void animDig(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraToxolophosaurus entity = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;
        int animCycle = 37;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-13.52398-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (18.06292-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-9.3647-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -13.52398 + (((tickAnim - 2) / 2) * (-33.91702-(-13.52398)));
            yy = 18.06292 + (((tickAnim - 2) / 2) * (62.65697-(18.06292)));
            zz = -9.3647 + (((tickAnim - 2) / 2) * (-23.40024-(-9.3647)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -33.91702 + (((tickAnim - 4) / 2) * (-21.4075-(-33.91702)));
            yy = 62.65697 + (((tickAnim - 4) / 2) * (69.75528-(62.65697)));
            zz = -23.40024 + (((tickAnim - 4) / 2) * (-14.68649-(-23.40024)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -21.4075 + (((tickAnim - 6) / 2) * (0-(-21.4075)));
            yy = 69.75528 + (((tickAnim - 6) / 2) * (58-(69.75528)));
            zz = -14.68649 + (((tickAnim - 6) / 2) * (0-(-14.68649)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (18.72562-(0)));
            yy = 58 + (((tickAnim - 8) / 2) * (38.07673-(58)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10.93297-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.72562 + (((tickAnim - 10) / 3) * (24.08041-(18.72562)));
            yy = 38.07673 + (((tickAnim - 10) / 3) * (11.02479-(38.07673)));
            zz = -10.93297 + (((tickAnim - 10) / 3) * (-6.64708-(-10.93297)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 24.08041 + (((tickAnim - 13) / 1) * (17.48233-(24.08041)));
            yy = 11.02479 + (((tickAnim - 13) / 1) * (-9.52459-(11.02479)));
            zz = -6.64708 + (((tickAnim - 13) / 1) * (-10.14509-(-6.64708)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 17.48233 + (((tickAnim - 14) / 3) * (0-(17.48233)));
            yy = -9.52459 + (((tickAnim - 14) / 3) * (0-(-9.52459)));
            zz = -10.14509 + (((tickAnim - 14) / 3) * (0-(-10.14509)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0.34782-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (1.97573-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (-0.15651-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.34782 + (((tickAnim - 25) / 3) * (0.77632-(0.34782)));
            yy = 1.97573 + (((tickAnim - 25) / 3) * (4.94489-(1.97573)));
            zz = -0.15651 + (((tickAnim - 25) / 3) * (-18.22773-(-0.15651)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0.77632 + (((tickAnim - 28) / 1) * (0.65199-(0.77632)));
            yy = 4.94489 + (((tickAnim - 28) / 1) * (5.43901-(4.94489)));
            zz = -18.22773 + (((tickAnim - 28) / 1) * (-18.23522-(-18.22773)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0.65199 + (((tickAnim - 29) / 2) * (0.28134-(0.65199)));
            yy = 5.43901 + (((tickAnim - 29) / 2) * (6.91401-(5.43901)));
            zz = -18.23522 + (((tickAnim - 29) / 2) * (-18.14701-(-18.23522)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.28134 + (((tickAnim - 31) / 2) * (0.15058-(0.28134)));
            yy = 6.91401 + (((tickAnim - 31) / 2) * (3.30334-(6.91401)));
            zz = -18.14701 + (((tickAnim - 31) / 2) * (-6.07294-(-18.14701)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 0.15058 + (((tickAnim - 33) / 0) * (0-(0.15058)));
            yy = 3.30334 + (((tickAnim - 33) / 0) * (0-(3.30334)));
            zz = -6.07294 + (((tickAnim - 33) / 0) * (0-(-6.07294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10.75036-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.91561-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (10.35006-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10.75036 + (((tickAnim - 2) / 2) * (-12.48679-(10.75036)));
            yy = -1.91561 + (((tickAnim - 2) / 2) * (-42.21089-(-1.91561)));
            zz = 10.35006 + (((tickAnim - 2) / 2) * (-17.11873-(10.35006)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.48679 + (((tickAnim - 4) / 2) * (-11.31025-(-12.48679)));
            yy = -42.21089 + (((tickAnim - 4) / 2) * (-48.16852-(-42.21089)));
            zz = -17.11873 + (((tickAnim - 4) / 2) * (-17.82809-(-17.11873)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.31025 + (((tickAnim - 6) / 2) * (-5.21161-(-11.31025)));
            yy = -48.16852 + (((tickAnim - 6) / 2) * (-21.09016-(-48.16852)));
            zz = -17.82809 + (((tickAnim - 6) / 2) * (-6.96424-(-17.82809)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.21161 + (((tickAnim - 8) / 2) * (3.84451-(-5.21161)));
            yy = -21.09016 + (((tickAnim - 8) / 2) * (-72.01728-(-21.09016)));
            zz = -6.96424 + (((tickAnim - 8) / 2) * (-23.74178-(-6.96424)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.84451 + (((tickAnim - 10) / 3) * (-13.99647-(3.84451)));
            yy = -72.01728 + (((tickAnim - 10) / 3) * (-71.60886-(-72.01728)));
            zz = -23.74178 + (((tickAnim - 10) / 3) * (-23.35107-(-23.74178)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -13.99647 + (((tickAnim - 13) / 1) * (-31.46025-(-13.99647)));
            yy = -71.60886 + (((tickAnim - 13) / 1) * (-37.10793-(-71.60886)));
            zz = -23.35107 + (((tickAnim - 13) / 1) * (-24.39807-(-23.35107)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -31.46025 + (((tickAnim - 14) / 2) * (-29.8165-(-31.46025)));
            yy = -37.10793 + (((tickAnim - 14) / 2) * (-8.13863-(-37.10793)));
            zz = -24.39807 + (((tickAnim - 14) / 2) * (-19.04291-(-24.39807)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -29.8165 + (((tickAnim - 16) / 1) * (0-(-29.8165)));
            yy = -8.13863 + (((tickAnim - 16) / 1) * (0-(-8.13863)));
            zz = -19.04291 + (((tickAnim - 16) / 1) * (0-(-19.04291)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (18.84919-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (5.94463-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (17.16994-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 18.84919 + (((tickAnim - 25) / 2) * (29.25586-(18.84919)));
            yy = 5.94463 + (((tickAnim - 25) / 2) * (-7.81146-(5.94463)));
            zz = 17.16994 + (((tickAnim - 25) / 2) * (37.59671-(17.16994)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 29.25586 + (((tickAnim - 27) / 1) * (31.60249-(29.25586)));
            yy = -7.81146 + (((tickAnim - 27) / 1) * (-15.39135-(-7.81146)));
            zz = 37.59671 + (((tickAnim - 27) / 1) * (45.35753-(37.59671)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 31.60249 + (((tickAnim - 28) / 1) * (22.90646-(31.60249)));
            yy = -15.39135 + (((tickAnim - 28) / 1) * (-23.6441-(-15.39135)));
            zz = 45.35753 + (((tickAnim - 28) / 1) * (43.90021-(45.35753)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 22.90646 + (((tickAnim - 29) / 2) * (13.74044-(22.90646)));
            yy = -23.6441 + (((tickAnim - 29) / 2) * (-32.47431-(-23.6441)));
            zz = 43.90021 + (((tickAnim - 29) / 2) * (42.47825-(43.90021)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 13.74044 + (((tickAnim - 31) / 1) * (12.55419-(13.74044)));
            yy = -32.47431 + (((tickAnim - 31) / 1) * (-19.98497-(-32.47431)));
            zz = 42.47825 + (((tickAnim - 31) / 1) * (31.01939-(42.47825)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 12.55419 + (((tickAnim - 32) / 1) * (8.85933-(12.55419)));
            yy = -19.98497 + (((tickAnim - 32) / 1) * (-8.68515-(-19.98497)));
            zz = 31.01939 + (((tickAnim - 32) / 1) * (17.68828-(31.01939)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 8.85933 + (((tickAnim - 33) / 0) * (0-(8.85933)));
            yy = -8.68515 + (((tickAnim - 33) / 0) * (0-(-8.68515)));
            zz = 17.68828 + (((tickAnim - 33) / 0) * (0-(17.68828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.23567-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.5303-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.63937-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -2.23567 + (((tickAnim - 2) / 2) * (0-(-2.23567)));
            yy = -0.5303 + (((tickAnim - 2) / 2) * (0-(-0.5303)));
            zz = -3.63937 + (((tickAnim - 2) / 2) * (3-(-3.63937)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-5.10917-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-1.72343-(0)));
            zz = 3 + (((tickAnim - 4) / 2) * (-9.28262-(3)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5.10917 + (((tickAnim - 6) / 2) * (0-(-5.10917)));
            yy = -1.72343 + (((tickAnim - 6) / 2) * (0-(-1.72343)));
            zz = -9.28262 + (((tickAnim - 6) / 2) * (4-(-9.28262)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (6.96548-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.42015-(0)));
            zz = 4 + (((tickAnim - 8) / 2) * (4.34386-(4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.96548 + (((tickAnim - 10) / 3) * (19-(6.96548)));
            yy = 1.42015 + (((tickAnim - 10) / 3) * (0-(1.42015)));
            zz = 4.34386 + (((tickAnim - 10) / 3) * (2-(4.34386)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 19 + (((tickAnim - 13) / 1) * (4.45932-(19)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.93497-(0)));
            zz = 2 + (((tickAnim - 13) / 1) * (-8.65715-(2)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 4.45932 + (((tickAnim - 14) / 2) * (-6.53027-(4.45932)));
            yy = 0.93497 + (((tickAnim - 14) / 2) * (0.05129-(0.93497)));
            zz = -8.65715 + (((tickAnim - 14) / 2) * (-8.64825-(-8.65715)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -6.53027 + (((tickAnim - 16) / 1) * (0-(-6.53027)));
            yy = 0.05129 + (((tickAnim - 16) / 1) * (0-(0.05129)));
            zz = -8.64825 + (((tickAnim - 16) / 1) * (0-(-8.64825)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0.00019-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (-5.97682-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (-0.52713-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.00019 + (((tickAnim - 25) / 3) * (-2.58684-(0.00019)));
            yy = -5.97682 + (((tickAnim - 25) / 3) * (-5.93441-(-5.97682)));
            zz = -0.52713 + (((tickAnim - 25) / 3) * (-16.06883-(-0.52713)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -2.58684 + (((tickAnim - 28) / 3) * (0.57576-(-2.58684)));
            yy = -5.93441 + (((tickAnim - 28) / 3) * (5.89647-(-5.93441)));
            zz = -16.06883 + (((tickAnim - 28) / 3) * (-23.94697-(-16.06883)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.57576 + (((tickAnim - 31) / 2) * (0.23697-(0.57576)));
            yy = 5.89647 + (((tickAnim - 31) / 2) * (-0.02085-(5.89647)));
            zz = -23.94697 + (((tickAnim - 31) / 2) * (-8.2028-(-23.94697)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 0.23697 + (((tickAnim - 33) / 0) * (0-(0.23697)));
            yy = -0.02085 + (((tickAnim - 33) / 0) * (0-(-0.02085)));
            zz = -8.2028 + (((tickAnim - 33) / 0) * (0-(-8.2028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 4 + (((tickAnim - 8) / 3) * (0.65714-(4)));
            zz = 0 + (((tickAnim - 8) / 3) * (-4-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.65714 + (((tickAnim - 11) / 3) * (-3.8-(0.65714)));
            zz = -4 + (((tickAnim - 11) / 3) * (0-(-4)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -3.8 + (((tickAnim - 14) / 3) * (0-(-3.8)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (-4-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -4 + (((tickAnim - 25) / 3) * (-0.65714-(-4)));
            zz = 0 + (((tickAnim - 25) / 3) * (4-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = -0.65714 + (((tickAnim - 28) / 3) * (3.8-(-0.65714)));
            zz = 4 + (((tickAnim - 28) / 3) * (0-(4)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 3.8 + (((tickAnim - 31) / 2) * (0-(3.8)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 8) / 3) * (17.17439-(20)));
            yy = 0 + (((tickAnim - 8) / 3) * (8.67412-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.46376-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 17.17439 + (((tickAnim - 11) / 5) * (16.06727-(17.17439)));
            yy = 8.67412 + (((tickAnim - 11) / 5) * (6.55264-(8.67412)));
            zz = -0.46376 + (((tickAnim - 11) / 5) * (6.26683-(-0.46376)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 16.06727 + (((tickAnim - 16) / 5) * (14.31997-(16.06727)));
            yy = 6.55264 + (((tickAnim - 16) / 5) * (8.17701-(6.55264)));
            zz = 6.26683 + (((tickAnim - 16) / 5) * (0.4426-(6.26683)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 14.31997 + (((tickAnim - 21) / 7) * (14.19581-(14.31997)));
            yy = 8.17701 + (((tickAnim - 21) / 7) * (3.33084-(8.17701)));
            zz = 0.4426 + (((tickAnim - 21) / 7) * (-0.7947-(0.4426)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 14.19581 + (((tickAnim - 28) / 5) * (8.19581-(14.19581)));
            yy = 3.33084 + (((tickAnim - 28) / 5) * (3.33084-(3.33084)));
            zz = -0.7947 + (((tickAnim - 28) / 5) * (-0.7947-(-0.7947)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 8.19581 + (((tickAnim - 33) / 5) * (0-(8.19581)));
            yy = 3.33084 + (((tickAnim - 33) / 5) * (0-(3.33084)));
            zz = -0.7947 + (((tickAnim - 33) / 5) * (0-(-0.7947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 5) / 6) * (-2-(5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 11) / 4) * (-2.00763-(-2)));
            yy = 0 + (((tickAnim - 11) / 4) * (-4.99695-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.17494-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -2.00763 + (((tickAnim - 15) / 6) * (-1.47316-(-2.00763)));
            yy = -4.99695 + (((tickAnim - 15) / 6) * (-5.17934-(-4.99695)));
            zz = 0.17494 + (((tickAnim - 15) / 6) * (-5.84604-(0.17494)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -1.47316 + (((tickAnim - 21) / 9) * (-3.01407-(-1.47316)));
            yy = -5.17934 + (((tickAnim - 21) / 9) * (-6.4676-(-5.17934)));
            zz = -5.84604 + (((tickAnim - 21) / 9) * (12.31007-(-5.84604)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.01407 + (((tickAnim - 30) / 3) * (3.40179-(-3.01407)));
            yy = -6.4676 + (((tickAnim - 30) / 3) * (-6.95227-(-6.4676)));
            zz = 12.31007 + (((tickAnim - 30) / 3) * (0.23682-(12.31007)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 3.40179 + (((tickAnim - 33) / 3) * (-6.59821-(3.40179)));
            yy = -6.95227 + (((tickAnim - 33) / 3) * (-6.95227-(-6.95227)));
            zz = 0.23682 + (((tickAnim - 33) / 3) * (0.23682-(0.23682)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -6.59821 + (((tickAnim - 36) / 2) * (0-(-6.59821)));
            yy = -6.95227 + (((tickAnim - 36) / 2) * (0-(-6.95227)));
            zz = 0.23682 + (((tickAnim - 36) / 2) * (0-(0.23682)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.1 + (((tickAnim - 0) / 6) * (0.34782-(0.1)));
            yy = -0.59 + (((tickAnim - 0) / 6) * (-1.97573-(-0.59)));
            zz = 0.05 + (((tickAnim - 0) / 6) * (0.15651-(0.05)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.34782 + (((tickAnim - 6) / 2) * (0.15496-(0.34782)));
            yy = -1.97573 + (((tickAnim - 6) / 2) * (-9.90421-(-1.97573)));
            zz = 0.15651 + (((tickAnim - 6) / 2) * (12.00646-(0.15651)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.15496 + (((tickAnim - 8) / 2) * (-1.0105-(0.15496)));
            yy = -9.90421 + (((tickAnim - 8) / 2) * (-8.02787-(-9.90421)));
            zz = 12.00646 + (((tickAnim - 8) / 2) * (14.33963-(12.00646)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -1.0105 + (((tickAnim - 10) / 1) * (-0.31397-(-1.0105)));
            yy = -8.02787 + (((tickAnim - 10) / 1) * (-8.94349-(-8.02787)));
            zz = 14.33963 + (((tickAnim - 10) / 1) * (16.24489-(14.33963)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.31397 + (((tickAnim - 11) / 2) * (-0.70017-(-0.31397)));
            yy = -8.94349 + (((tickAnim - 11) / 2) * (-4.56929-(-8.94349)));
            zz = 16.24489 + (((tickAnim - 11) / 2) * (13.80622-(16.24489)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -0.70017 + (((tickAnim - 13) / 1) * (-0.5463-(-0.70017)));
            yy = -4.56929 + (((tickAnim - 13) / 1) * (2.96188-(-4.56929)));
            zz = 13.80622 + (((tickAnim - 13) / 1) * (-0.26667-(13.80622)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.5463 + (((tickAnim - 14) / 3) * (0.5918-(-0.5463)));
            yy = 2.96188 + (((tickAnim - 14) / 3) * (-3.45865-(2.96188)));
            zz = -0.26667 + (((tickAnim - 14) / 3) * (0.25067-(-0.26667)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.5918 + (((tickAnim - 17) / 2) * (0.34782-(0.5918)));
            yy = -3.45865 + (((tickAnim - 17) / 2) * (-1.97573-(-3.45865)));
            zz = 0.25067 + (((tickAnim - 17) / 2) * (0.15651-(0.25067)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0.34782 + (((tickAnim - 19) / 2) * (-13.52398-(0.34782)));
            yy = -1.97573 + (((tickAnim - 19) / 2) * (-18.06292-(-1.97573)));
            zz = 0.15651 + (((tickAnim - 19) / 2) * (9.3647-(0.15651)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -13.52398 + (((tickAnim - 21) / 2) * (-33.91702-(-13.52398)));
            yy = -18.06292 + (((tickAnim - 21) / 2) * (-62.65697-(-18.06292)));
            zz = 9.3647 + (((tickAnim - 21) / 2) * (23.40024-(9.3647)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -33.91702 + (((tickAnim - 23) / 2) * (-21.4075-(-33.91702)));
            yy = -62.65697 + (((tickAnim - 23) / 2) * (-69.75528-(-62.65697)));
            zz = 23.40024 + (((tickAnim - 23) / 2) * (14.68649-(23.40024)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -21.4075 + (((tickAnim - 25) / 3) * (0-(-21.4075)));
            yy = -69.75528 + (((tickAnim - 25) / 3) * (-58-(-69.75528)));
            zz = 14.68649 + (((tickAnim - 25) / 3) * (0-(14.68649)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (18.72562-(0)));
            yy = -58 + (((tickAnim - 28) / 1) * (-38.07673-(-58)));
            zz = 0 + (((tickAnim - 28) / 1) * (10.93297-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 18.72562 + (((tickAnim - 29) / 3) * (24.08041-(18.72562)));
            yy = -38.07673 + (((tickAnim - 29) / 3) * (-11.02479-(-38.07673)));
            zz = 10.93297 + (((tickAnim - 29) / 3) * (6.64708-(10.93297)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 24.08041 + (((tickAnim - 32) / 1) * (17.48233-(24.08041)));
            yy = -11.02479 + (((tickAnim - 32) / 1) * (9.52459-(-11.02479)));
            zz = 6.64708 + (((tickAnim - 32) / 1) * (10.14509-(6.64708)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 17.48233 + (((tickAnim - 33) / 3) * (0-(17.48233)));
            yy = 9.52459 + (((tickAnim - 33) / 3) * (0-(9.52459)));
            zz = 10.14509 + (((tickAnim - 33) / 3) * (0-(10.14509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.65 + (((tickAnim - 0) / 6) * (18.84919-(5.65)));
            yy = -1.78 + (((tickAnim - 0) / 6) * (-5.94463-(-1.78)));
            zz = -5.15 + (((tickAnim - 0) / 6) * (-17.16994-(-5.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 18.84919 + (((tickAnim - 6) / 2) * (36.47576-(18.84919)));
            yy = -5.94463 + (((tickAnim - 6) / 2) * (14.19848-(-5.94463)));
            zz = -17.16994 + (((tickAnim - 6) / 2) * (-49.36293-(-17.16994)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 36.47576 + (((tickAnim - 8) / 3) * (21.73061-(36.47576)));
            yy = 14.19848 + (((tickAnim - 8) / 3) * (15.53859-(14.19848)));
            zz = -49.36293 + (((tickAnim - 8) / 3) * (-36.928-(-49.36293)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 21.73061 + (((tickAnim - 11) / 2) * (20.38291-(21.73061)));
            yy = 15.53859 + (((tickAnim - 11) / 2) * (13.38798-(15.53859)));
            zz = -36.928 + (((tickAnim - 11) / 2) * (-35.56598-(-36.928)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 20.38291 + (((tickAnim - 13) / 1) * (0-(20.38291)));
            yy = 13.38798 + (((tickAnim - 13) / 1) * (0-(13.38798)));
            zz = -35.56598 + (((tickAnim - 13) / 1) * (0-(-35.56598)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (10.75036-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (1.91561-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (-10.35006-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 10.75036 + (((tickAnim - 21) / 2) * (-12.48679-(10.75036)));
            yy = 1.91561 + (((tickAnim - 21) / 2) * (42.21089-(1.91561)));
            zz = -10.35006 + (((tickAnim - 21) / 2) * (17.11873-(-10.35006)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.48679 + (((tickAnim - 23) / 2) * (-11.31025-(-12.48679)));
            yy = 42.21089 + (((tickAnim - 23) / 2) * (48.16852-(42.21089)));
            zz = 17.11873 + (((tickAnim - 23) / 2) * (17.82809-(17.11873)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -11.31025 + (((tickAnim - 25) / 3) * (-5.21161-(-11.31025)));
            yy = 48.16852 + (((tickAnim - 25) / 3) * (21.09016-(48.16852)));
            zz = 17.82809 + (((tickAnim - 25) / 3) * (6.96424-(17.82809)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -5.21161 + (((tickAnim - 28) / 1) * (3.84451-(-5.21161)));
            yy = 21.09016 + (((tickAnim - 28) / 1) * (72.01728-(21.09016)));
            zz = 6.96424 + (((tickAnim - 28) / 1) * (23.74178-(6.96424)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 3.84451 + (((tickAnim - 29) / 3) * (-13.99647-(3.84451)));
            yy = 72.01728 + (((tickAnim - 29) / 3) * (71.60886-(72.01728)));
            zz = 23.74178 + (((tickAnim - 29) / 3) * (23.35107-(23.74178)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -13.99647 + (((tickAnim - 32) / 1) * (-31.46025-(-13.99647)));
            yy = 71.60886 + (((tickAnim - 32) / 1) * (37.10793-(71.60886)));
            zz = 23.35107 + (((tickAnim - 32) / 1) * (24.39807-(23.35107)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -31.46025 + (((tickAnim - 33) / 2) * (-29.8165-(-31.46025)));
            yy = 37.10793 + (((tickAnim - 33) / 2) * (8.13863-(37.10793)));
            zz = 24.39807 + (((tickAnim - 33) / 2) * (19.04291-(24.39807)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -29.8165 + (((tickAnim - 35) / 1) * (0-(-29.8165)));
            yy = 8.13863 + (((tickAnim - 35) / 1) * (0-(8.13863)));
            zz = 19.04291 + (((tickAnim - 35) / 1) * (0-(19.04291)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.00019-(0)));
            yy = 1.79 + (((tickAnim - 0) / 6) * (5.97682-(1.79)));
            zz = 0.16 + (((tickAnim - 0) / 6) * (0.52713-(0.16)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.00019 + (((tickAnim - 6) / 1) * (-0.97287-(0.00019)));
            yy = 5.97682 + (((tickAnim - 6) / 1) * (2.47406-(5.97682)));
            zz = 0.52713 + (((tickAnim - 6) / 1) * (5.46297-(0.52713)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.97287 + (((tickAnim - 7) / 1) * (-1.78112-(-0.97287)));
            yy = 2.47406 + (((tickAnim - 7) / 1) * (5.88171-(2.47406)));
            zz = 5.46297 + (((tickAnim - 7) / 1) * (16.60282-(5.46297)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.78112 + (((tickAnim - 8) / 2) * (0.61682-(-1.78112)));
            yy = 5.88171 + (((tickAnim - 8) / 2) * (2.09677-(5.88171)));
            zz = 16.60282 + (((tickAnim - 8) / 2) * (14.20146-(16.60282)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.61682 + (((tickAnim - 10) / 1) * (-0.20339-(0.61682)));
            yy = 2.09677 + (((tickAnim - 10) / 1) * (2.08213-(2.09677)));
            zz = 14.20146 + (((tickAnim - 10) / 1) * (15.34148-(14.20146)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.20339 + (((tickAnim - 11) / 2) * (3.62711-(-0.20339)));
            yy = 2.08213 + (((tickAnim - 11) / 2) * (2.34281-(2.08213)));
            zz = 15.34148 + (((tickAnim - 11) / 2) * (9.8116-(15.34148)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 3.62711 + (((tickAnim - 13) / 1) * (-0.00683-(3.62711)));
            yy = 2.34281 + (((tickAnim - 13) / 1) * (2.98841-(2.34281)));
            zz = 9.8116 + (((tickAnim - 13) / 1) * (0.26442-(9.8116)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -0.00683 + (((tickAnim - 14) / 5) * (-0.00683-(-0.00683)));
            yy = 2.98841 + (((tickAnim - 14) / 5) * (2.98841-(2.98841)));
            zz = 0.26442 + (((tickAnim - 14) / 5) * (0.26442-(0.26442)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -0.00683 + (((tickAnim - 19) / 2) * (-2.23567-(-0.00683)));
            yy = 2.98841 + (((tickAnim - 19) / 2) * (0.5303-(2.98841)));
            zz = 0.26442 + (((tickAnim - 19) / 2) * (3.63937-(0.26442)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -2.23567 + (((tickAnim - 21) / 2) * (0-(-2.23567)));
            yy = 0.5303 + (((tickAnim - 21) / 2) * (0-(0.5303)));
            zz = 3.63937 + (((tickAnim - 21) / 2) * (-3-(3.63937)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (-5.10917-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (1.72343-(0)));
            zz = -3 + (((tickAnim - 23) / 2) * (9.28262-(-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -5.10917 + (((tickAnim - 25) / 3) * (0-(-5.10917)));
            yy = 1.72343 + (((tickAnim - 25) / 3) * (0-(1.72343)));
            zz = 9.28262 + (((tickAnim - 25) / 3) * (-4-(9.28262)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (6.96548-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (-1.42015-(0)));
            zz = -4 + (((tickAnim - 28) / 1) * (-4.34386-(-4)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 6.96548 + (((tickAnim - 29) / 3) * (19-(6.96548)));
            yy = -1.42015 + (((tickAnim - 29) / 3) * (0-(-1.42015)));
            zz = -4.34386 + (((tickAnim - 29) / 3) * (-2-(-4.34386)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 32) / 1) * (4.45932-(19)));
            yy = 0 + (((tickAnim - 32) / 1) * (-0.93497-(0)));
            zz = -2 + (((tickAnim - 32) / 1) * (8.65715-(-2)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 4.45932 + (((tickAnim - 33) / 2) * (-6.53027-(4.45932)));
            yy = -0.93497 + (((tickAnim - 33) / 2) * (-0.05129-(-0.93497)));
            zz = 8.65715 + (((tickAnim - 33) / 2) * (8.64825-(8.65715)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -6.53027 + (((tickAnim - 35) / 1) * (0-(-6.53027)));
            yy = -0.05129 + (((tickAnim - 35) / 1) * (0-(-0.05129)));
            zz = 8.64825 + (((tickAnim - 35) / 1) * (0-(8.64825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraToxolophosaurus entity = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;
        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 4) / 6) * (-3-(2)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -3 + (((tickAnim - 10) / 28) * (-3-(-3)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -3 + (((tickAnim - 38) / 6) * (0-(-3)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(xx), pelvis.rotateAngleY + (float) Math.toRadians(yy), pelvis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 4) / 6) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(xx);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(yy);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 4) / 6) * (3-(-3.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3 + (((tickAnim - 10) / 28) * (3-(3)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 3 + (((tickAnim - 38) / 6) * (0-(3)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.83333-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5.83333 + (((tickAnim - 4) / 6) * (2-(5.83333)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 10) / 28) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 2 + (((tickAnim - 38) / 6) * (0-(2)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.83333-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -2.83333 + (((tickAnim - 4) / 6) * (-2-(-2.83333)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 10) / 28) * (-2-(-2)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -2 + (((tickAnim - 38) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.5 + (((tickAnim - 4) / 6) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 10) / 28) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -3.5 + (((tickAnim - 38) / 6) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 4) / 6) * (-1-(2)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -1 + (((tickAnim - 10) / 28) * (-1-(-1)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -1 + (((tickAnim - 38) / 6) * (0-(-1)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (4.2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.2 + (((tickAnim - 2) / 2) * (3-(4.2)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 4) / 6) * (0-(3)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = -1 + (((tickAnim - 17) / 11) * (2-(-1)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 2 + (((tickAnim - 28) / 10) * (2-(2)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (1.00015-(0)));
            yy = 2 + (((tickAnim - 38) / 3) * (0.99985-(2)));
            zz = 0 + (((tickAnim - 38) / 3) * (0.01745-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 1.00015 + (((tickAnim - 41) / 3) * (0-(1.00015)));
            yy = 0.99985 + (((tickAnim - 41) / 3) * (0-(0.99985)));
            zz = 0.01745 + (((tickAnim - 41) / 3) * (0-(0.01745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.2 + (((tickAnim - 3) / 1) * (2-(7.2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 4) / 3) * (1.43-(2)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.43 + (((tickAnim - 7) / 3) * (-11-(1.43)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 10) / 3) * (-11-(-11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 13) / 2) * (-10.98961-(-11)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.99752-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.07113-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.98961 + (((tickAnim - 15) / 3) * (-10.96082-(-10.98961)));
            yy = -0.99752 + (((tickAnim - 15) / 3) * (-7.98039-(-0.99752)));
            zz = -0.07113 + (((tickAnim - 15) / 3) * (-0.56169-(-0.07113)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -10.96082 + (((tickAnim - 18) / 5) * (-10.96082-(-10.96082)));
            yy = -7.98039 + (((tickAnim - 18) / 5) * (-7.98039-(-7.98039)));
            zz = -0.56169 + (((tickAnim - 18) / 5) * (-0.56169-(-0.56169)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -10.96082 + (((tickAnim - 23) / 3) * (-10.90567-(-10.96082)));
            yy = -7.98039 + (((tickAnim - 23) / 3) * (1.55883-(-7.98039)));
            zz = -0.56169 + (((tickAnim - 23) / 3) * (-2.40026-(-0.56169)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -10.90567 + (((tickAnim - 26) / 3) * (-10.86671-(-10.90567)));
            yy = 1.55883 + (((tickAnim - 26) / 3) * (2.82185-(1.55883)));
            zz = -2.40026 + (((tickAnim - 26) / 3) * (-2.64336-(-2.40026)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -10.86671 + (((tickAnim - 29) / 5) * (-7.13971-(-10.86671)));
            yy = 2.82185 + (((tickAnim - 29) / 5) * (-1.10963-(2.82185)));
            zz = -2.64336 + (((tickAnim - 29) / 5) * (-1.97072-(-2.64336)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -7.13971 + (((tickAnim - 34) / 10) * (0-(-7.13971)));
            yy = -1.10963 + (((tickAnim - 34) / 10) * (0-(-1.10963)));
            zz = -1.97072 + (((tickAnim - 34) / 10) * (0-(-1.97072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.2-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.2 + (((tickAnim - 3) / 1) * (-7-(-5.2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -7 + (((tickAnim - 4) / 6) * (-21-(-7)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -21 + (((tickAnim - 10) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -21 + (((tickAnim - 13) / 2) * (-20.81368-(-21)));
            yy = 0 + (((tickAnim - 13) / 2) * (-8.20812-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-2.21753-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -20.81368 + (((tickAnim - 15) / 3) * (-20.89248-(-20.81368)));
            yy = -8.20812 + (((tickAnim - 15) / 3) * (-6.76035-(-8.20812)));
            zz = -2.21753 + (((tickAnim - 15) / 3) * (-1.82019-(-2.21753)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -20.89248 + (((tickAnim - 18) / 5) * (-20.89248-(-20.89248)));
            yy = -6.76035 + (((tickAnim - 18) / 5) * (-6.76035-(-6.76035)));
            zz = -1.82019 + (((tickAnim - 18) / 5) * (-1.82019-(-1.82019)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -20.89248 + (((tickAnim - 23) / 3) * (-19.48484-(-20.89248)));
            yy = -6.76035 + (((tickAnim - 23) / 3) * (8.68622-(-6.76035)));
            zz = -1.82019 + (((tickAnim - 23) / 3) * (4.40906-(-1.82019)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -19.48484 + (((tickAnim - 26) / 3) * (-19.05838-(-19.48484)));
            yy = 8.68622 + (((tickAnim - 26) / 3) * (11.37805-(8.68622)));
            zz = 4.40906 + (((tickAnim - 26) / 3) * (4.26713-(4.40906)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -19.05838 + (((tickAnim - 29) / 5) * (-3.72352-(-19.05838)));
            yy = 11.37805 + (((tickAnim - 29) / 5) * (1.6901-(11.37805)));
            zz = 4.26713 + (((tickAnim - 29) / 5) * (2.12393-(4.26713)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -3.72352 + (((tickAnim - 34) / 5) * (4.1379-(-3.72352)));
            yy = 1.6901 + (((tickAnim - 34) / 5) * (0.821-(1.6901)));
            zz = 2.12393 + (((tickAnim - 34) / 5) * (1.25461-(2.12393)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 4.1379 + (((tickAnim - 39) / 5) * (0-(4.1379)));
            yy = 0.821 + (((tickAnim - 39) / 5) * (0-(0.821)));
            zz = 1.25461 + (((tickAnim - 39) / 5) * (0-(1.25461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (16-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 16 + (((tickAnim - 29) / 3) * (0-(16)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.76123-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.64283-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-16.33886-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.76123 + (((tickAnim - 4) / 6) * (-0.52045-(-0.76123)));
            yy = 2.64283 + (((tickAnim - 4) / 6) * (-1.55782-(2.64283)));
            zz = -16.33886 + (((tickAnim - 4) / 6) * (9.15723-(-16.33886)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -0.52045 + (((tickAnim - 10) / 7) * (-0.50029-(-0.52045)));
            yy = -1.55782 + (((tickAnim - 10) / 7) * (-2.5572-(-1.55782)));
            zz = 9.15723 + (((tickAnim - 10) / 7) * (9.11664-(9.15723)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -0.50029 + (((tickAnim - 17) / 11) * (-0.85992-(-0.50029)));
            yy = -2.5572 + (((tickAnim - 17) / 11) * (-3.50569-(-2.5572)));
            zz = 9.11664 + (((tickAnim - 17) / 11) * (9.23085-(9.11664)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -0.85992 + (((tickAnim - 28) / 10) * (-0.49793-(-0.85992)));
            yy = -3.50569 + (((tickAnim - 28) / 10) * (-2.01508-(-3.50569)));
            zz = 9.23085 + (((tickAnim - 28) / 10) * (6.13583-(9.23085)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -0.49793 + (((tickAnim - 38) / 3) * (-0.22548-(-0.49793)));
            yy = -2.01508 + (((tickAnim - 38) / 3) * (-0.99394-(-2.01508)));
            zz = 6.13583 + (((tickAnim - 38) / 3) * (2.05693-(6.13583)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -0.22548 + (((tickAnim - 41) / 3) * (0-(-0.22548)));
            yy = -0.99394 + (((tickAnim - 41) / 3) * (0-(-0.99394)));
            zz = 2.05693 + (((tickAnim - 41) / 3) * (0-(2.05693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-6.88876-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.42604-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.58041-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.88876 + (((tickAnim - 2) / 1) * (0.9512-(-6.88876)));
            yy = 2.42604 + (((tickAnim - 2) / 1) * (1.55997-(2.42604)));
            zz = -1.58041 + (((tickAnim - 2) / 1) * (6.36547-(-1.58041)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.9512 + (((tickAnim - 3) / 1) * (12.27046-(0.9512)));
            yy = 1.55997 + (((tickAnim - 3) / 1) * (1.79893-(1.55997)));
            zz = 6.36547 + (((tickAnim - 3) / 1) * (21.58669-(6.36547)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 12.27046 + (((tickAnim - 4) / 6) * (-1.21042-(12.27046)));
            yy = 1.79893 + (((tickAnim - 4) / 6) * (-1.60679-(1.79893)));
            zz = 21.58669 + (((tickAnim - 4) / 6) * (-4.50325-(21.58669)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -1.21042 + (((tickAnim - 10) / 7) * (4.56147-(-1.21042)));
            yy = -1.60679 + (((tickAnim - 10) / 7) * (0.61735-(-1.60679)));
            zz = -4.50325 + (((tickAnim - 10) / 7) * (0.52925-(-4.50325)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 4.56147 + (((tickAnim - 17) / 11) * (-5.89941-(4.56147)));
            yy = 0.61735 + (((tickAnim - 17) / 11) * (-3.99114-(0.61735)));
            zz = 0.52925 + (((tickAnim - 17) / 11) * (-8.4596-(0.52925)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -5.89941 + (((tickAnim - 28) / 10) * (6.21695-(-5.89941)));
            yy = -3.99114 + (((tickAnim - 28) / 10) * (-11.00968-(-3.99114)));
            zz = -8.4596 + (((tickAnim - 28) / 10) * (-0.80469-(-8.4596)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 6.21695 + (((tickAnim - 38) / 6) * (0-(6.21695)));
            yy = -11.00968 + (((tickAnim - 38) / 6) * (0-(-11.00968)));
            zz = -0.80469 + (((tickAnim - 38) / 6) * (0-(-0.80469)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-3.72134-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.70514-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.12564-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.72134 + (((tickAnim - 2) / 1) * (-6.62905-(-3.72134)));
            yy = -1.70514 + (((tickAnim - 2) / 1) * (-2.53641-(-1.70514)));
            zz = 1.12564 + (((tickAnim - 2) / 1) * (0.45075-(1.12564)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -6.62905 + (((tickAnim - 3) / 1) * (-6.88176-(-6.62905)));
            yy = -2.53641 + (((tickAnim - 3) / 1) * (-4.22736-(-2.53641)));
            zz = 0.45075 + (((tickAnim - 3) / 1) * (0.75124-(0.45075)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -6.88176 + (((tickAnim - 4) / 6) * (2.96403-(-6.88176)));
            yy = -4.22736 + (((tickAnim - 4) / 6) * (-2.57579-(-4.22736)));
            zz = 0.75124 + (((tickAnim - 4) / 6) * (-2.67428-(0.75124)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.96403 + (((tickAnim - 10) / 7) * (2.96403-(2.96403)));
            yy = -2.57579 + (((tickAnim - 10) / 7) * (-2.57579-(-2.57579)));
            zz = -2.67428 + (((tickAnim - 10) / 7) * (-2.67428-(-2.67428)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 2.96403 + (((tickAnim - 17) / 11) * (3.11824-(2.96403)));
            yy = -2.57579 + (((tickAnim - 17) / 11) * (3.32603-(-2.57579)));
            zz = -2.67428 + (((tickAnim - 17) / 11) * (-1.57544-(-2.67428)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 3.11824 + (((tickAnim - 28) / 10) * (-4.59485-(3.11824)));
            yy = 3.32603 + (((tickAnim - 28) / 10) * (6.72969-(3.32603)));
            zz = -1.57544 + (((tickAnim - 28) / 10) * (-5.59697-(-1.57544)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -4.59485 + (((tickAnim - 38) / 6) * (0-(-4.59485)));
            yy = 6.72969 + (((tickAnim - 38) / 6) * (0-(6.72969)));
            zz = -5.59697 + (((tickAnim - 38) / 6) * (0-(-5.59697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.76123-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.64283-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (16.33886-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.76123 + (((tickAnim - 4) / 6) * (0.18275-(-0.76123)));
            yy = -2.64283 + (((tickAnim - 4) / 6) * (-0.33889-(-2.64283)));
            zz = 16.33886 + (((tickAnim - 4) / 6) * (-8.96295-(16.33886)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0.18275 + (((tickAnim - 10) / 7) * (-0.14489-(0.18275)));
            yy = -0.33889 + (((tickAnim - 10) / 7) * (1.6085-(-0.33889)));
            zz = -8.96295 + (((tickAnim - 10) / 7) * (-9.00971-(-8.96295)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -0.14489 + (((tickAnim - 17) / 11) * (1.91998-(-0.14489)));
            yy = 1.6085 + (((tickAnim - 17) / 11) * (-4.08493-(1.6085)));
            zz = -9.00971 + (((tickAnim - 17) / 11) * (-8.50559-(-9.00971)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 1.91998 + (((tickAnim - 28) / 10) * (1.80589-(1.91998)));
            yy = -4.08493 + (((tickAnim - 28) / 10) * (-5.69231-(-4.08493)));
            zz = -8.50559 + (((tickAnim - 28) / 10) * (-5.68621-(-8.50559)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 1.80589 + (((tickAnim - 38) / 6) * (0-(1.80589)));
            yy = -5.69231 + (((tickAnim - 38) / 6) * (0-(-5.69231)));
            zz = -5.68621 + (((tickAnim - 38) / 6) * (0-(-5.68621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-6.88876-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-2.42604-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.58041-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.88876 + (((tickAnim - 2) / 1) * (0.9512-(-6.88876)));
            yy = -2.42604 + (((tickAnim - 2) / 1) * (-1.55997-(-2.42604)));
            zz = 1.58041 + (((tickAnim - 2) / 1) * (-6.36547-(1.58041)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.9512 + (((tickAnim - 3) / 1) * (12.27046-(0.9512)));
            yy = -1.55997 + (((tickAnim - 3) / 1) * (-1.79893-(-1.55997)));
            zz = -6.36547 + (((tickAnim - 3) / 1) * (-21.58669-(-6.36547)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 12.27046 + (((tickAnim - 4) / 6) * (-1.21042-(12.27046)));
            yy = -1.79893 + (((tickAnim - 4) / 6) * (1.60679-(-1.79893)));
            zz = -21.58669 + (((tickAnim - 4) / 6) * (4.50325-(-21.58669)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -1.21042 + (((tickAnim - 10) / 7) * (-1.19713-(-1.21042)));
            yy = 1.60679 + (((tickAnim - 10) / 7) * (1.61124-(1.60679)));
            zz = 4.50325 + (((tickAnim - 10) / 7) * (4.49411-(4.50325)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -1.19713 + (((tickAnim - 17) / 11) * (-7.28958-(-1.19713)));
            yy = 1.61124 + (((tickAnim - 17) / 11) * (4.80627-(1.61124)));
            zz = 4.49411 + (((tickAnim - 17) / 11) * (9.59905-(4.49411)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -7.28958 + (((tickAnim - 28) / 10) * (10.27288-(-7.28958)));
            yy = 4.80627 + (((tickAnim - 28) / 10) * (8.78887-(4.80627)));
            zz = 9.59905 + (((tickAnim - 28) / 10) * (-2.41597-(9.59905)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 10.27288 + (((tickAnim - 38) / 3) * (4.13955-(10.27288)));
            yy = 8.78887 + (((tickAnim - 38) / 3) * (4.23394-(8.78887)));
            zz = -2.41597 + (((tickAnim - 38) / 3) * (0.60453-(-2.41597)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 4.13955 + (((tickAnim - 41) / 3) * (0-(4.13955)));
            yy = 4.23394 + (((tickAnim - 41) / 3) * (0-(4.23394)));
            zz = 0.60453 + (((tickAnim - 41) / 3) * (0-(0.60453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-3.72134-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.70514-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.12564-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.72134 + (((tickAnim - 2) / 1) * (-6.62905-(-3.72134)));
            yy = 1.70514 + (((tickAnim - 2) / 1) * (2.53641-(1.70514)));
            zz = -1.12564 + (((tickAnim - 2) / 1) * (-0.45075-(-1.12564)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -6.62905 + (((tickAnim - 3) / 1) * (-6.88176-(-6.62905)));
            yy = 2.53641 + (((tickAnim - 3) / 1) * (4.22736-(2.53641)));
            zz = -0.45075 + (((tickAnim - 3) / 1) * (-0.75124-(-0.45075)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -6.88176 + (((tickAnim - 4) / 6) * (2.96403-(-6.88176)));
            yy = 4.22736 + (((tickAnim - 4) / 6) * (2.57579-(4.22736)));
            zz = -0.75124 + (((tickAnim - 4) / 6) * (2.67428-(-0.75124)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.96403 + (((tickAnim - 10) / 7) * (2.96403-(2.96403)));
            yy = 2.57579 + (((tickAnim - 10) / 7) * (2.57579-(2.57579)));
            zz = 2.67428 + (((tickAnim - 10) / 7) * (2.67428-(2.67428)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 2.96403 + (((tickAnim - 17) / 11) * (3.04582-(2.96403)));
            yy = 2.57579 + (((tickAnim - 17) / 11) * (-1.3604-(2.57579)));
            zz = 2.67428 + (((tickAnim - 17) / 11) * (1.9534-(2.67428)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 3.04582 + (((tickAnim - 28) / 10) * (-4.80765-(3.04582)));
            yy = -1.3604 + (((tickAnim - 28) / 10) * (-0.73701-(-1.3604)));
            zz = 1.9534 + (((tickAnim - 28) / 10) * (5.86039-(1.9534)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -4.80765 + (((tickAnim - 38) / 3) * (-3.13284-(-4.80765)));
            yy = -0.73701 + (((tickAnim - 38) / 3) * (-0.40147-(-0.73701)));
            zz = 5.86039 + (((tickAnim - 38) / 3) * (3.75931-(5.86039)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -3.13284 + (((tickAnim - 41) / 3) * (0-(-3.13284)));
            yy = -0.40147 + (((tickAnim - 41) / 3) * (0-(-0.40147)));
            zz = 3.75931 + (((tickAnim - 41) / 3) * (0-(3.75931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.44265-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.03515-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.68978-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.44265 + (((tickAnim - 4) / 6) * (-3.42069-(-3.44265)));
            yy = 0.03515 + (((tickAnim - 4) / 6) * (-1.96202-(0.03515)));
            zz = -2.68978 + (((tickAnim - 4) / 6) * (-2.78402-(-2.68978)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -3.42069 + (((tickAnim - 10) / 28) * (-3.42069-(-3.42069)));
            yy = -1.96202 + (((tickAnim - 10) / 28) * (-1.96202-(-1.96202)));
            zz = -2.78402 + (((tickAnim - 10) / 28) * (-2.78402-(-2.78402)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -3.42069 + (((tickAnim - 38) / 6) * (0-(-3.42069)));
            yy = -1.96202 + (((tickAnim - 38) / 6) * (0-(-1.96202)));
            zz = -2.78402 + (((tickAnim - 38) / 6) * (0-(-2.78402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (3.43342-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (1.25789-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-1.29819-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3.43342 + (((tickAnim - 10) / 28) * (3.43342-(3.43342)));
            yy = 1.25789 + (((tickAnim - 10) / 28) * (1.25789-(1.25789)));
            zz = -1.29819 + (((tickAnim - 10) / 28) * (-1.29819-(-1.29819)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 3.43342 + (((tickAnim - 38) / 6) * (0-(3.43342)));
            yy = 1.25789 + (((tickAnim - 38) / 6) * (0-(1.25789)));
            zz = -1.29819 + (((tickAnim - 38) / 6) * (0-(-1.29819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.46707-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.16206-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.31014-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.46707 + (((tickAnim - 4) / 6) * (0.43461-(-0.46707)));
            yy = -0.16206 + (((tickAnim - 4) / 6) * (-0.11997-(-0.16206)));
            zz = 1.31014 + (((tickAnim - 4) / 6) * (0.90675-(1.31014)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0.43461 + (((tickAnim - 10) / 28) * (3.13771-(0.43461)));
            yy = -0.11997 + (((tickAnim - 10) / 28) * (0.04426-(-0.11997)));
            zz = 0.90675 + (((tickAnim - 10) / 28) * (-0.29883-(0.90675)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 3.13771 + (((tickAnim - 38) / 6) * (0-(3.13771)));
            yy = 0.04426 + (((tickAnim - 38) / 6) * (0-(0.04426)));
            zz = -0.29883 + (((tickAnim - 38) / 6) * (0-(-0.29883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.44265-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.03515-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.68978-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.44265 + (((tickAnim - 4) / 6) * (-3.42069-(-3.44265)));
            yy = -0.03515 + (((tickAnim - 4) / 6) * (1.96202-(-0.03515)));
            zz = 2.68978 + (((tickAnim - 4) / 6) * (2.78402-(2.68978)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -3.42069 + (((tickAnim - 10) / 28) * (-3.42069-(-3.42069)));
            yy = 1.96202 + (((tickAnim - 10) / 28) * (1.96202-(1.96202)));
            zz = 2.78402 + (((tickAnim - 10) / 28) * (2.78402-(2.78402)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -3.42069 + (((tickAnim - 38) / 6) * (0-(-3.42069)));
            yy = 1.96202 + (((tickAnim - 38) / 6) * (0-(1.96202)));
            zz = 2.78402 + (((tickAnim - 38) / 6) * (0-(2.78402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (3.43342-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-1.25789-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (1.29819-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3.43342 + (((tickAnim - 10) / 28) * (3.43342-(3.43342)));
            yy = -1.25789 + (((tickAnim - 10) / 28) * (-1.25789-(-1.25789)));
            zz = 1.29819 + (((tickAnim - 10) / 28) * (1.29819-(1.29819)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 3.43342 + (((tickAnim - 38) / 6) * (0-(3.43342)));
            yy = -1.25789 + (((tickAnim - 38) / 6) * (0-(-1.25789)));
            zz = 1.29819 + (((tickAnim - 38) / 6) * (0-(1.29819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.46707-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.16206-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.31014-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.46707 + (((tickAnim - 4) / 6) * (0.43461-(-0.46707)));
            yy = 0.16206 + (((tickAnim - 4) / 6) * (0.11997-(0.16206)));
            zz = -1.31014 + (((tickAnim - 4) / 6) * (-0.90675-(-1.31014)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0.43461 + (((tickAnim - 10) / 28) * (3.13771-(0.43461)));
            yy = 0.11997 + (((tickAnim - 10) / 28) * (-0.04426-(0.11997)));
            zz = -0.90675 + (((tickAnim - 10) / 28) * (0.29883-(-0.90675)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 3.13771 + (((tickAnim - 38) / 6) * (0-(3.13771)));
            yy = -0.04426 + (((tickAnim - 38) / 6) * (0-(-0.04426)));
            zz = 0.29883 + (((tickAnim - 38) / 6) * (0-(0.29883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraToxolophosaurus entity = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 12) / 21) * (0-(0)));
            yy = -0.3 + (((tickAnim - 12) / 21) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 12) / 21) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 33) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(xx);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(yy);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2 + (((tickAnim - 8) / 5) * (12.53947-(2)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 12.53947 + (((tickAnim - 13) / 6) * (12.05263-(12.53947)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 12.05263 + (((tickAnim - 19) / 14) * (12.05263-(12.05263)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.05263 + (((tickAnim - 33) / 2) * (2.03509-(12.05263)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.03509 + (((tickAnim - 35) / 5) * (0-(2.03509)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (-0.17763-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.17763 + (((tickAnim - 11) / 2) * (8.04474-(-0.17763)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.04474 + (((tickAnim - 13) / 2) * (8.52632-(8.04474)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 8.52632 + (((tickAnim - 15) / 18) * (8.52632-(8.52632)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 8.52632 + (((tickAnim - 33) / 2) * (14.68421-(8.52632)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 14.68421 + (((tickAnim - 35) / 5) * (0-(14.68421)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -3 + (((tickAnim - 8) / 3) * (-10.09211-(-3)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.09211 + (((tickAnim - 11) / 2) * (-2.58421-(-10.09211)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.58421 + (((tickAnim - 13) / 2) * (7.42105-(-2.58421)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 7.42105 + (((tickAnim - 15) / 18) * (7.42105-(7.42105)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 7.42105 + (((tickAnim - 33) / 2) * (7.94737-(7.42105)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 7.94737 + (((tickAnim - 35) / 3) * (11.97368-(7.94737)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 11.97368 + (((tickAnim - 38) / 2) * (0-(11.97368)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6 + (((tickAnim - 8) / 3) * (-3.33114-(-6)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -3.33114 + (((tickAnim - 11) / 2) * (-7.62719-(-3.33114)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.62719 + (((tickAnim - 13) / 2) * (2.84211-(-7.62719)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 2.84211 + (((tickAnim - 15) / 18) * (2.84211-(2.84211)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.84211 + (((tickAnim - 33) / 2) * (10.89474-(2.84211)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10.89474 + (((tickAnim - 35) / 3) * (10.44737-(10.89474)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 10.44737 + (((tickAnim - 38) / 2) * (0-(10.44737)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.83333-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -2.83333 + (((tickAnim - 9) / 6) * (-3-(-2.83333)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 15) / 18) * (-3-(-3)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -3 + (((tickAnim - 33) / 7) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.05556-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 5.05556 + (((tickAnim - 9) / 6) * (5-(5.05556)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 15) / 18) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 33) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 7) / 6) * (12-(8)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 13) / 13) * (15-(12)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 26) / 11) * (3-(15)));
            yy = 0 + (((tickAnim - 26) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 11) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 37) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 5) / 7) * (-8-(9)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 12) / 11) * (-12-(-8)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 23) / 12) * (-17-(-12)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 35) / 5) * (0-(-17)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.01924-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.1765-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-4.96007-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -0.01924 + (((tickAnim - 9) / 6) * (-0.02578-(-0.01924)));
            yy = -0.1765 + (((tickAnim - 9) / 6) * (-0.22558-(-0.1765)));
            zz = -4.96007 + (((tickAnim - 9) / 6) * (-6.48401-(-4.96007)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -0.02578 + (((tickAnim - 15) / 18) * (-0.02578-(-0.02578)));
            yy = -0.22558 + (((tickAnim - 15) / 18) * (-0.22558-(-0.22558)));
            zz = -6.48401 + (((tickAnim - 15) / 18) * (-6.48401-(-6.48401)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.02578 + (((tickAnim - 33) / 7) * (0-(-0.02578)));
            yy = -0.22558 + (((tickAnim - 33) / 7) * (0-(-0.22558)));
            zz = -6.48401 + (((tickAnim - 33) / 7) * (0-(-6.48401)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12.71159-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-3.06571-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (22.1995-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 12.71159 + (((tickAnim - 9) / 6) * (17.51806-(12.71159)));
            yy = -3.06571 + (((tickAnim - 9) / 6) * (-4.08143-(-3.06571)));
            zz = 22.1995 + (((tickAnim - 9) / 6) * (30.41222-(22.1995)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 17.51806 + (((tickAnim - 15) / 18) * (17.51806-(17.51806)));
            yy = -4.08143 + (((tickAnim - 15) / 18) * (-4.08143-(-4.08143)));
            zz = 30.41222 + (((tickAnim - 15) / 18) * (30.41222-(30.41222)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.51806 + (((tickAnim - 33) / 7) * (0-(17.51806)));
            yy = -4.08143 + (((tickAnim - 33) / 7) * (0-(-4.08143)));
            zz = 30.41222 + (((tickAnim - 33) / 7) * (0-(30.41222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.43966-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.89634-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-9.82806-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 3.43966 + (((tickAnim - 15) / 18) * (3.43966-(3.43966)));
            yy = 1.89634 + (((tickAnim - 15) / 18) * (1.89634-(1.89634)));
            zz = -9.82806 + (((tickAnim - 15) / 18) * (-9.82806-(-9.82806)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 3.43966 + (((tickAnim - 33) / 7) * (0-(3.43966)));
            yy = 1.89634 + (((tickAnim - 33) / 7) * (0-(1.89634)));
            zz = -9.82806 + (((tickAnim - 33) / 7) * (0-(-9.82806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.01924-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.1765-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (4.96007-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -0.01924 + (((tickAnim - 9) / 6) * (-0.02578-(-0.01924)));
            yy = 0.1765 + (((tickAnim - 9) / 6) * (0.22558-(0.1765)));
            zz = 4.96007 + (((tickAnim - 9) / 6) * (6.48401-(4.96007)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -0.02578 + (((tickAnim - 15) / 18) * (-0.02578-(-0.02578)));
            yy = 0.22558 + (((tickAnim - 15) / 18) * (0.22558-(0.22558)));
            zz = 6.48401 + (((tickAnim - 15) / 18) * (6.48401-(6.48401)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.02578 + (((tickAnim - 33) / 7) * (0-(-0.02578)));
            yy = 0.22558 + (((tickAnim - 33) / 7) * (0-(0.22558)));
            zz = 6.48401 + (((tickAnim - 33) / 7) * (0-(6.48401)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12.71159-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (3.06571-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-22.1995-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 12.71159 + (((tickAnim - 9) / 6) * (17.51806-(12.71159)));
            yy = 3.06571 + (((tickAnim - 9) / 6) * (4.08143-(3.06571)));
            zz = -22.1995 + (((tickAnim - 9) / 6) * (-30.41222-(-22.1995)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 17.51806 + (((tickAnim - 15) / 18) * (17.51806-(17.51806)));
            yy = 4.08143 + (((tickAnim - 15) / 18) * (4.08143-(4.08143)));
            zz = -30.41222 + (((tickAnim - 15) / 18) * (-30.41222-(-30.41222)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.51806 + (((tickAnim - 33) / 7) * (0-(17.51806)));
            yy = 4.08143 + (((tickAnim - 33) / 7) * (0-(4.08143)));
            zz = -30.41222 + (((tickAnim - 33) / 7) * (0-(-30.41222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.43966-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.89634-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (9.82806-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 3.43966 + (((tickAnim - 15) / 18) * (3.43966-(3.43966)));
            yy = -1.89634 + (((tickAnim - 15) / 18) * (-1.89634-(-1.89634)));
            zz = 9.82806 + (((tickAnim - 15) / 18) * (9.82806-(9.82806)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 3.43966 + (((tickAnim - 33) / 7) * (0-(3.43966)));
            yy = -1.89634 + (((tickAnim - 33) / 7) * (0-(-1.89634)));
            zz = 9.82806 + (((tickAnim - 33) / 7) * (0-(9.82806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.83487-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.57373-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-9.3248-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -6.83487 + (((tickAnim - 15) / 18) * (-6.83487-(-6.83487)));
            yy = -0.57373 + (((tickAnim - 15) / 18) * (-0.57373-(-0.57373)));
            zz = -9.3248 + (((tickAnim - 15) / 18) * (-9.3248-(-9.3248)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -6.83487 + (((tickAnim - 33) / 7) * (0-(-6.83487)));
            yy = -0.57373 + (((tickAnim - 33) / 7) * (0-(-0.57373)));
            zz = -9.3248 + (((tickAnim - 33) / 7) * (0-(-9.3248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.19963-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.49261-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (8.59226-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -1.19963 + (((tickAnim - 9) / 6) * (0.96319-(-1.19963)));
            yy = -1.49261 + (((tickAnim - 9) / 6) * (-2.49659-(-1.49261)));
            zz = 8.59226 + (((tickAnim - 9) / 6) * (8.88333-(8.59226)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0.96319 + (((tickAnim - 15) / 18) * (0.96319-(0.96319)));
            yy = -2.49659 + (((tickAnim - 15) / 18) * (-2.49659-(-2.49659)));
            zz = 8.88333 + (((tickAnim - 15) / 18) * (8.88333-(8.88333)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0.96319 + (((tickAnim - 33) / 7) * (0-(0.96319)));
            yy = -2.49659 + (((tickAnim - 33) / 7) * (0-(-2.49659)));
            zz = 8.88333 + (((tickAnim - 33) / 7) * (0-(8.88333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.70944-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.30009-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-2.76186-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -2.70944 + (((tickAnim - 9) / 6) * (-2.2365-(-2.70944)));
            yy = 0.30009 + (((tickAnim - 9) / 6) * (0.06056-(0.30009)));
            zz = -2.76186 + (((tickAnim - 9) / 6) * (-0.07002-(-2.76186)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -2.2365 + (((tickAnim - 15) / 18) * (-2.2365-(-2.2365)));
            yy = 0.06056 + (((tickAnim - 15) / 18) * (0.06056-(0.06056)));
            zz = -0.07002 + (((tickAnim - 15) / 18) * (-0.07002-(-0.07002)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -2.2365 + (((tickAnim - 33) / 7) * (0-(-2.2365)));
            yy = 0.06056 + (((tickAnim - 33) / 7) * (0-(0.06056)));
            zz = -0.07002 + (((tickAnim - 33) / 7) * (0-(-0.07002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.83487-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.57373-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (9.3248-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -6.83487 + (((tickAnim - 15) / 18) * (-6.83487-(-6.83487)));
            yy = 0.57373 + (((tickAnim - 15) / 18) * (0.57373-(0.57373)));
            zz = 9.3248 + (((tickAnim - 15) / 18) * (9.3248-(9.3248)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -6.83487 + (((tickAnim - 33) / 7) * (0-(-6.83487)));
            yy = 0.57373 + (((tickAnim - 33) / 7) * (0-(0.57373)));
            zz = 9.3248 + (((tickAnim - 33) / 7) * (0-(9.3248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.19963-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.49261-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-8.59226-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -1.19963 + (((tickAnim - 9) / 6) * (0.96319-(-1.19963)));
            yy = 1.49261 + (((tickAnim - 9) / 6) * (2.49659-(1.49261)));
            zz = -8.59226 + (((tickAnim - 9) / 6) * (-8.88333-(-8.59226)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0.96319 + (((tickAnim - 15) / 18) * (0.96319-(0.96319)));
            yy = 2.49659 + (((tickAnim - 15) / 18) * (2.49659-(2.49659)));
            zz = -8.88333 + (((tickAnim - 15) / 18) * (-8.88333-(-8.88333)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0.96319 + (((tickAnim - 33) / 7) * (0-(0.96319)));
            yy = 2.49659 + (((tickAnim - 33) / 7) * (0-(2.49659)));
            zz = -8.88333 + (((tickAnim - 33) / 7) * (0-(-8.88333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.70944-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.30009-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (2.76186-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -2.70944 + (((tickAnim - 9) / 6) * (-2.2365-(-2.70944)));
            yy = -0.30009 + (((tickAnim - 9) / 6) * (-0.06056-(-0.30009)));
            zz = 2.76186 + (((tickAnim - 9) / 6) * (0.07002-(2.76186)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -2.2365 + (((tickAnim - 15) / 18) * (-2.2365-(-2.2365)));
            yy = -0.06056 + (((tickAnim - 15) / 18) * (-0.06056-(-0.06056)));
            zz = 0.07002 + (((tickAnim - 15) / 18) * (0.07002-(0.07002)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -2.2365 + (((tickAnim - 33) / 7) * (0-(-2.2365)));
            yy = -0.06056 + (((tickAnim - 33) / 7) * (0-(-0.06056)));
            zz = 0.07002 + (((tickAnim - 33) / 7) * (0-(0.07002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraToxolophosaurus entity = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 11 + (((tickAnim - 0) / 5) * (0-(11)));
            zz = 0 + (((tickAnim - 0) / 5) * (7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-11-(0)));
            zz = 7 + (((tickAnim - 5) / 5) * (0-(7)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -11 + (((tickAnim - 10) / 5) * (0-(-11)));
            zz = 0 + (((tickAnim - 10) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (11-(0)));
            zz = -7 + (((tickAnim - 15) / 5) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(xx), pelvis.rotateAngleY + (float) Math.toRadians(yy), pelvis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.6 + (((tickAnim - 0) / 5) * (0-(-0.6)));
            yy = 0.8 + (((tickAnim - 0) / 5) * (1.4-(0.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0.6-(0)));
            yy = 1.4 + (((tickAnim - 5) / 5) * (0.8-(1.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.6 + (((tickAnim - 10) / 5) * (0-(0.6)));
            yy = 0.8 + (((tickAnim - 10) / 5) * (1.4-(0.8)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.6-(0)));
            yy = 1.4 + (((tickAnim - 15) / 5) * (0.8-(1.4)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(xx);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(yy);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.12736 + (((tickAnim - 0) / 5) * (-14.7653-(-11.12736)));
            yy = -13.94427 + (((tickAnim - 0) / 5) * (-2.2736-(-13.94427)));
            zz = 0.58955 + (((tickAnim - 0) / 5) * (-11.78575-(0.58955)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -14.7653 + (((tickAnim - 5) / 5) * (-11.12736-(-14.7653)));
            yy = -2.2736 + (((tickAnim - 5) / 5) * (13.94427-(-2.2736)));
            zz = -11.78575 + (((tickAnim - 5) / 5) * (-0.58955-(-11.78575)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.12736 + (((tickAnim - 10) / 5) * (-14.7653-(-11.12736)));
            yy = 13.94427 + (((tickAnim - 10) / 5) * (2.2736-(13.94427)));
            zz = -0.58955 + (((tickAnim - 10) / 5) * (11.78575-(-0.58955)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.7653 + (((tickAnim - 15) / 5) * (-11.12736-(-14.7653)));
            yy = 2.2736 + (((tickAnim - 15) / 5) * (-13.94427-(2.2736)));
            zz = 11.78575 + (((tickAnim - 15) / 5) * (0.58955-(11.78575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.08748 + (((tickAnim - 0) / 5) * (13.03-(12.08748)));
            yy = 6.84629 + (((tickAnim - 0) / 5) * (0-(6.84629)));
            zz = 1.46235 + (((tickAnim - 0) / 5) * (0-(1.46235)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.03 + (((tickAnim - 5) / 5) * (12.08748-(13.03)));
            yy = 0 + (((tickAnim - 5) / 5) * (-6.84629-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-1.46235-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.08748 + (((tickAnim - 10) / 5) * (13.03-(12.08748)));
            yy = -6.84629 + (((tickAnim - 10) / 5) * (0-(-6.84629)));
            zz = -1.46235 + (((tickAnim - 10) / 5) * (0-(-1.46235)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.03 + (((tickAnim - 15) / 5) * (12.08748-(13.03)));
            yy = 0 + (((tickAnim - 15) / 5) * (6.84629-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (1.46235-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.00122 + (((tickAnim - 0) / 5) * (0-(-2.00122)));
            yy = -1.99878 + (((tickAnim - 0) / 5) * (0-(-1.99878)));
            zz = 0.06983 + (((tickAnim - 0) / 5) * (0-(0.06983)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-2.00122-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.99878-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.06983-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.00122 + (((tickAnim - 10) / 5) * (0-(-2.00122)));
            yy = 1.99878 + (((tickAnim - 10) / 5) * (0-(1.99878)));
            zz = -0.06983 + (((tickAnim - 10) / 5) * (0-(-0.06983)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-2.00122-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-1.99878-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.06983-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 5) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4 + (((tickAnim - 15) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.36433-(0)));
            yy = -13 + (((tickAnim - 0) / 5) * (3.6752-(-13)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.29134-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.36433 + (((tickAnim - 5) / 5) * (0-(-1.36433)));
            yy = 3.6752 + (((tickAnim - 5) / 5) * (13-(3.6752)));
            zz = -5.29134 + (((tickAnim - 5) / 5) * (0-(-5.29134)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-1.36433-(0)));
            yy = 13 + (((tickAnim - 10) / 5) * (-3.6752-(13)));
            zz = 0 + (((tickAnim - 10) / 5) * (5.29134-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.36433 + (((tickAnim - 15) / 5) * (0-(-1.36433)));
            yy = -3.6752 + (((tickAnim - 15) / 5) * (-13-(-3.6752)));
            zz = 5.29134 + (((tickAnim - 15) / 5) * (0-(5.29134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.17494-(0)));
            yy = 6 + (((tickAnim - 0) / 5) * (-4.99695-(6)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.00763-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.17494 + (((tickAnim - 5) / 5) * (0-(-0.17494)));
            yy = -4.99695 + (((tickAnim - 5) / 5) * (-6-(-4.99695)));
            zz = 7.00763 + (((tickAnim - 5) / 5) * (0-(7.00763)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.17494-(0)));
            yy = -6 + (((tickAnim - 10) / 5) * (4.99695-(-6)));
            zz = 0 + (((tickAnim - 10) / 5) * (-7.00763-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.17494 + (((tickAnim - 15) / 5) * (0-(-0.17494)));
            yy = 4.99695 + (((tickAnim - 15) / 5) * (6-(4.99695)));
            zz = -7.00763 + (((tickAnim - 15) / 5) * (0-(-7.00763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -7 + (((tickAnim - 0) / 5) * (-4-(-7)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -4 + (((tickAnim - 5) / 5) * (7-(-4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 7 + (((tickAnim - 10) / 5) * (-4-(7)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -4 + (((tickAnim - 15) / 5) * (-7-(-4)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -4 + (((tickAnim - 0) / 5) * (-7-(-4)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -7 + (((tickAnim - 5) / 5) * (4-(-7)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 4 + (((tickAnim - 10) / 5) * (7-(4)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 7 + (((tickAnim - 15) / 5) * (-4-(7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.2824 + (((tickAnim - 0) / 3) * (17.44789-(0.2824)));
            yy = 64.94375 + (((tickAnim - 0) / 3) * (37.85393-(64.94375)));
            zz = 9.87877 + (((tickAnim - 0) / 3) * (5.79996-(9.87877)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.44789 + (((tickAnim - 3) / 2) * (42.60409-(17.44789)));
            yy = 37.85393 + (((tickAnim - 3) / 2) * (15.00902-(37.85393)));
            zz = 5.79996 + (((tickAnim - 3) / 2) * (-4.06908-(5.79996)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 42.60409 + (((tickAnim - 5) / 5) * (37.22333-(42.60409)));
            yy = 15.00902 + (((tickAnim - 5) / 5) * (-5.18294-(15.00902)));
            zz = -4.06908 + (((tickAnim - 5) / 5) * (7.07556-(-4.06908)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 37.22333 + (((tickAnim - 10) / 2) * (52.70509-(37.22333)));
            yy = -5.18294 + (((tickAnim - 10) / 2) * (-13.85742-(-5.18294)));
            zz = 7.07556 + (((tickAnim - 10) / 2) * (-9.66111-(7.07556)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 52.70509 + (((tickAnim - 12) / 3) * (15.12256-(52.70509)));
            yy = -13.85742 + (((tickAnim - 12) / 3) * (18.43855-(-13.85742)));
            zz = -9.66111 + (((tickAnim - 12) / 3) * (8.70418-(-9.66111)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 15.12256 + (((tickAnim - 15) / 2) * (10.71624-(15.12256)));
            yy = 18.43855 + (((tickAnim - 15) / 2) * (62.5891-(18.43855)));
            zz = 8.70418 + (((tickAnim - 15) / 2) * (14.68113-(8.70418)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10.71624 + (((tickAnim - 17) / 3) * (0.2824-(10.71624)));
            yy = 62.5891 + (((tickAnim - 17) / 3) * (64.94375-(62.5891)));
            zz = 14.68113 + (((tickAnim - 17) / 3) * (9.87877-(14.68113)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.70204 + (((tickAnim - 0) / 3) * (7.78354-(0.70204)));
            yy = -31.59873 + (((tickAnim - 0) / 3) * (-3.9451-(-31.59873)));
            zz = 1.0307 + (((tickAnim - 0) / 3) * (9.12952-(1.0307)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.78354 + (((tickAnim - 3) / 2) * (10.92879-(7.78354)));
            yy = -3.9451 + (((tickAnim - 3) / 2) * (4.18525-(-3.9451)));
            zz = 9.12952 + (((tickAnim - 3) / 2) * (10.04835-(9.12952)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.92879 + (((tickAnim - 5) / 3) * (-124.2658-(10.92879)));
            yy = 4.18525 + (((tickAnim - 5) / 3) * (12.71452-(4.18525)));
            zz = 10.04835 + (((tickAnim - 5) / 3) * (-130.80956-(10.04835)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -124.2658 + (((tickAnim - 8) / 2) * (-107.04451-(-124.2658)));
            yy = 12.71452 + (((tickAnim - 8) / 2) * (3.07763-(12.71452)));
            zz = -130.80956 + (((tickAnim - 8) / 2) * (-116.33544-(-130.80956)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -107.04451 + (((tickAnim - 10) / 2) * (-95.5734-(-107.04451)));
            yy = 3.07763 + (((tickAnim - 10) / 2) * (8.56659-(3.07763)));
            zz = -116.33544 + (((tickAnim - 10) / 2) * (-102.93829-(-116.33544)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -95.5734 + (((tickAnim - 12) / 1) * (-63.94022-(-95.5734)));
            yy = 8.56659 + (((tickAnim - 12) / 1) * (-37.73334-(8.56659)));
            zz = -102.93829 + (((tickAnim - 12) / 1) * (-59.82093-(-102.93829)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -63.94022 + (((tickAnim - 13) / 2) * (-60.28497-(-63.94022)));
            yy = -37.73334 + (((tickAnim - 13) / 2) * (-44.33487-(-37.73334)));
            zz = -59.82093 + (((tickAnim - 13) / 2) * (-57.77198-(-59.82093)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -60.28497 + (((tickAnim - 15) / 2) * (-32.93471-(-60.28497)));
            yy = -44.33487 + (((tickAnim - 15) / 2) * (-41.64495-(-44.33487)));
            zz = -57.77198 + (((tickAnim - 15) / 2) * (-31.15201-(-57.77198)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.93471 + (((tickAnim - 17) / 3) * (0.70204-(-32.93471)));
            yy = -41.64495 + (((tickAnim - 17) / 3) * (-31.59873-(-41.64495)));
            zz = -31.15201 + (((tickAnim - 17) / 3) * (1.0307-(-31.15201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.45586 + (((tickAnim - 0) / 3) * (0.81824-(4.45586)));
            yy = 0.56972 + (((tickAnim - 0) / 3) * (0.32337-(0.56972)));
            zz = -4.716 + (((tickAnim - 0) / 3) * (-14.65823-(-4.716)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.81824 + (((tickAnim - 3) / 2) * (-2.83482-(0.81824)));
            yy = 0.32337 + (((tickAnim - 3) / 2) * (0.23895-(0.32337)));
            zz = -14.65823 + (((tickAnim - 3) / 2) * (-41.2876-(-14.65823)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.83482 + (((tickAnim - 5) / 3) * (3.91213-(-2.83482)));
            yy = 0.23895 + (((tickAnim - 5) / 3) * (0.82184-(0.23895)));
            zz = -41.2876 + (((tickAnim - 5) / 3) * (-21.29489-(-41.2876)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.91213 + (((tickAnim - 8) / 2) * (0.56808-(3.91213)));
            yy = 0.82184 + (((tickAnim - 8) / 2) * (1.7317-(0.82184)));
            zz = -21.29489 + (((tickAnim - 8) / 2) * (-12.4124-(-21.29489)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0.56808 + (((tickAnim - 10) / 2) * (-2.57683-(0.56808)));
            yy = 1.7317 + (((tickAnim - 10) / 2) * (0.61937-(1.7317)));
            zz = -12.4124 + (((tickAnim - 10) / 2) * (-20.98843-(-12.4124)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.57683 + (((tickAnim - 12) / 1) * (25.58082-(-2.57683)));
            yy = 0.61937 + (((tickAnim - 12) / 1) * (-0.10372-(0.61937)));
            zz = -20.98843 + (((tickAnim - 12) / 1) * (-3.65278-(-20.98843)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25.58082 + (((tickAnim - 13) / 2) * (21.73848-(25.58082)));
            yy = -0.10372 + (((tickAnim - 13) / 2) * (-0.82681-(-0.10372)));
            zz = -3.65278 + (((tickAnim - 13) / 2) * (13.68287-(-3.65278)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 21.73848 + (((tickAnim - 15) / 2) * (-20.99015-(21.73848)));
            yy = -0.82681 + (((tickAnim - 15) / 2) * (-6.47036-(-0.82681)));
            zz = 13.68287 + (((tickAnim - 15) / 2) * (-19.92142-(13.68287)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -20.99015 + (((tickAnim - 17) / 3) * (4.45586-(-20.99015)));
            yy = -6.47036 + (((tickAnim - 17) / 3) * (0.56972-(-6.47036)));
            zz = -19.92142 + (((tickAnim - 17) / 3) * (-4.716-(-19.92142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-3.09531-(0)));
            yy = -6 + (((tickAnim - 0) / 2) * (-22.86896-(-6)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.50872-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -3.09531 + (((tickAnim - 2) / 2) * (-21.1016-(-3.09531)));
            yy = -22.86896 + (((tickAnim - 2) / 2) * (26.29577-(-22.86896)));
            zz = 1.50872 + (((tickAnim - 2) / 2) * (-23.55981-(1.50872)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.1016 + (((tickAnim - 4) / 3) * (-27.13848-(-21.1016)));
            yy = 26.29577 + (((tickAnim - 4) / 3) * (35.80096-(26.29577)));
            zz = -23.55981 + (((tickAnim - 4) / 3) * (-29.25256-(-23.55981)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -27.13848 + (((tickAnim - 7) / 1) * (-18.10477-(-27.13848)));
            yy = 35.80096 + (((tickAnim - 7) / 1) * (46.59306-(35.80096)));
            zz = -29.25256 + (((tickAnim - 7) / 1) * (-18.70856-(-29.25256)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.10477 + (((tickAnim - 8) / 2) * (-12.59583-(-18.10477)));
            yy = 46.59306 + (((tickAnim - 8) / 2) * (47.24423-(46.59306)));
            zz = -18.70856 + (((tickAnim - 8) / 2) * (-12.92478-(-18.70856)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -12.59583 + (((tickAnim - 10) / 4) * (21.40903-(-12.59583)));
            yy = 47.24423 + (((tickAnim - 10) / 4) * (30.97961-(47.24423)));
            zz = -12.92478 + (((tickAnim - 10) / 4) * (25.34015-(-12.92478)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 21.40903 + (((tickAnim - 14) / 6) * (0-(21.40903)));
            yy = 30.97961 + (((tickAnim - 14) / 6) * (-6-(30.97961)));
            zz = 25.34015 + (((tickAnim - 14) / 6) * (0-(25.34015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -90.53864 + (((tickAnim - 0) / 2) * (-73.10467-(-90.53864)));
            yy = -15.98706 + (((tickAnim - 0) / 2) * (-21.41297-(-15.98706)));
            zz = 76.65079 + (((tickAnim - 0) / 2) * (66.16634-(76.65079)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -73.10467 + (((tickAnim - 2) / 1) * (-48.56685-(-73.10467)));
            yy = -21.41297 + (((tickAnim - 2) / 1) * (-12.0241-(-21.41297)));
            zz = 66.16634 + (((tickAnim - 2) / 1) * (71.76765-(66.16634)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -48.56685 + (((tickAnim - 3) / 1) * (53.35201-(-48.56685)));
            yy = -12.0241 + (((tickAnim - 3) / 1) * (-21.0941-(-12.0241)));
            zz = 71.76765 + (((tickAnim - 3) / 1) * (-34.0816-(71.76765)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 53.35201 + (((tickAnim - 4) / 3) * (12.18017-(53.35201)));
            yy = -21.0941 + (((tickAnim - 4) / 3) * (10.50742-(-21.0941)));
            zz = -34.0816 + (((tickAnim - 4) / 3) * (14.39486-(-34.0816)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.18017 + (((tickAnim - 7) / 1) * (-37.01554-(12.18017)));
            yy = 10.50742 + (((tickAnim - 7) / 1) * (1.10407-(10.50742)));
            zz = 14.39486 + (((tickAnim - 7) / 1) * (37.38204-(14.39486)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.01554 + (((tickAnim - 8) / 2) * (-25.45051-(-37.01554)));
            yy = 1.10407 + (((tickAnim - 8) / 2) * (7.90718-(1.10407)));
            zz = 37.38204 + (((tickAnim - 8) / 2) * (28.71977-(37.38204)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -25.45051 + (((tickAnim - 10) / 4) * (-47.90892-(-25.45051)));
            yy = 7.90718 + (((tickAnim - 10) / 4) * (-0.70692-(7.90718)));
            zz = 28.71977 + (((tickAnim - 10) / 4) * (42.09692-(28.71977)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -47.90892 + (((tickAnim - 14) / 6) * (-90.53864-(-47.90892)));
            yy = -0.70692 + (((tickAnim - 14) / 6) * (-15.98706-(-0.70692)));
            zz = 42.09692 + (((tickAnim - 14) / 6) * (76.65079-(42.09692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 28.39101 + (((tickAnim - 0) / 2) * (86.90517-(28.39101)));
            yy = 75.77733 + (((tickAnim - 0) / 2) * (84.88668-(75.77733)));
            zz = 23.64249 + (((tickAnim - 0) / 2) * (83.46641-(23.64249)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 86.90517 + (((tickAnim - 2) / 1) * (-13.61392-(86.90517)));
            yy = 84.88668 + (((tickAnim - 2) / 1) * (44.30587-(84.88668)));
            zz = 83.46641 + (((tickAnim - 2) / 1) * (-25.26972-(83.46641)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -13.61392 + (((tickAnim - 3) / 0) * (-17.95352-(-13.61392)));
            yy = 44.30587 + (((tickAnim - 3) / 0) * (13.74767-(44.30587)));
            zz = -25.26972 + (((tickAnim - 3) / 0) * (-29.84083-(-25.26972)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.95352 + (((tickAnim - 3) / 1) * (9.74162-(-17.95352)));
            yy = 13.74767 + (((tickAnim - 3) / 1) * (13.15163-(13.74767)));
            zz = -29.84083 + (((tickAnim - 3) / 1) * (9.47871-(-29.84083)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 9.74162 + (((tickAnim - 4) / 3) * (-13.36-(9.74162)));
            yy = 13.15163 + (((tickAnim - 4) / 3) * (26.80948-(13.15163)));
            zz = 9.47871 + (((tickAnim - 4) / 3) * (-31.38448-(9.47871)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -13.36 + (((tickAnim - 7) / 1) * (8.41276-(-13.36)));
            yy = 26.80948 + (((tickAnim - 7) / 1) * (53.78675-(26.80948)));
            zz = -31.38448 + (((tickAnim - 7) / 1) * (-7.6776-(-31.38448)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 8.41276 + (((tickAnim - 8) / 3) * (10.18519-(8.41276)));
            yy = 53.78675 + (((tickAnim - 8) / 3) * (60.69847-(53.78675)));
            zz = -7.6776 + (((tickAnim - 8) / 3) * (-6.80148-(-7.6776)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 10.18519 + (((tickAnim - 11) / 3) * (-7.43432-(10.18519)));
            yy = 60.69847 + (((tickAnim - 11) / 3) * (73.29438-(60.69847)));
            zz = -6.80148 + (((tickAnim - 11) / 3) * (-21.97308-(-6.80148)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -7.43432 + (((tickAnim - 14) / 3) * (-3.98969-(-7.43432)));
            yy = 73.29438 + (((tickAnim - 14) / 3) * (83.00146-(73.29438)));
            zz = -21.97308 + (((tickAnim - 14) / 3) * (-20.66042-(-21.97308)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3.98969 + (((tickAnim - 17) / 3) * (28.39101-(-3.98969)));
            yy = 83.00146 + (((tickAnim - 17) / 3) * (75.77733-(83.00146)));
            zz = -20.66042 + (((tickAnim - 17) / 3) * (23.64249-(-20.66042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.59583 + (((tickAnim - 0) / 4) * (21.40903-(-12.59583)));
            yy = -47.24423 + (((tickAnim - 0) / 4) * (-30.97961-(-47.24423)));
            zz = 12.92478 + (((tickAnim - 0) / 4) * (-25.34015-(12.92478)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 21.40903 + (((tickAnim - 4) / 6) * (0-(21.40903)));
            yy = -30.97961 + (((tickAnim - 4) / 6) * (6-(-30.97961)));
            zz = -25.34015 + (((tickAnim - 4) / 6) * (0-(-25.34015)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-3.09531-(0)));
            yy = 6 + (((tickAnim - 10) / 2) * (22.86896-(6)));
            zz = 0 + (((tickAnim - 10) / 2) * (-1.50872-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -3.09531 + (((tickAnim - 12) / 2) * (-21.1016-(-3.09531)));
            yy = 22.86896 + (((tickAnim - 12) / 2) * (-26.29577-(22.86896)));
            zz = -1.50872 + (((tickAnim - 12) / 2) * (23.55981-(-1.50872)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -21.1016 + (((tickAnim - 14) / 3) * (-27.13848-(-21.1016)));
            yy = -26.29577 + (((tickAnim - 14) / 3) * (-35.80096-(-26.29577)));
            zz = 23.55981 + (((tickAnim - 14) / 3) * (29.25256-(23.55981)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -27.13848 + (((tickAnim - 17) / 1) * (-18.10477-(-27.13848)));
            yy = -35.80096 + (((tickAnim - 17) / 1) * (-46.59306-(-35.80096)));
            zz = 29.25256 + (((tickAnim - 17) / 1) * (18.70856-(29.25256)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.10477 + (((tickAnim - 18) / 2) * (-12.59583-(-18.10477)));
            yy = -46.59306 + (((tickAnim - 18) / 2) * (-47.24423-(-46.59306)));
            zz = 18.70856 + (((tickAnim - 18) / 2) * (12.92478-(18.70856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -25.45051 + (((tickAnim - 0) / 4) * (-47.90892-(-25.45051)));
            yy = -7.90718 + (((tickAnim - 0) / 4) * (0.70692-(-7.90718)));
            zz = -28.71977 + (((tickAnim - 0) / 4) * (-42.09692-(-28.71977)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -47.90892 + (((tickAnim - 4) / 6) * (-90.53864-(-47.90892)));
            yy = 0.70692 + (((tickAnim - 4) / 6) * (15.98706-(0.70692)));
            zz = -42.09692 + (((tickAnim - 4) / 6) * (-76.65079-(-42.09692)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -90.53864 + (((tickAnim - 10) / 2) * (-73.10467-(-90.53864)));
            yy = 15.98706 + (((tickAnim - 10) / 2) * (21.41297-(15.98706)));
            zz = -76.65079 + (((tickAnim - 10) / 2) * (-66.16634-(-76.65079)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -73.10467 + (((tickAnim - 12) / 1) * (-48.56685-(-73.10467)));
            yy = 21.41297 + (((tickAnim - 12) / 1) * (12.0241-(21.41297)));
            zz = -66.16634 + (((tickAnim - 12) / 1) * (-71.76765-(-66.16634)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -48.56685 + (((tickAnim - 13) / 1) * (53.35201-(-48.56685)));
            yy = 12.0241 + (((tickAnim - 13) / 1) * (21.0941-(12.0241)));
            zz = -71.76765 + (((tickAnim - 13) / 1) * (34.0816-(-71.76765)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 53.35201 + (((tickAnim - 14) / 3) * (12.18017-(53.35201)));
            yy = 21.0941 + (((tickAnim - 14) / 3) * (-10.50742-(21.0941)));
            zz = 34.0816 + (((tickAnim - 14) / 3) * (-14.39486-(34.0816)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 12.18017 + (((tickAnim - 17) / 1) * (-37.01554-(12.18017)));
            yy = -10.50742 + (((tickAnim - 17) / 1) * (-1.10407-(-10.50742)));
            zz = -14.39486 + (((tickAnim - 17) / 1) * (-37.38204-(-14.39486)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.01554 + (((tickAnim - 18) / 2) * (-25.45051-(-37.01554)));
            yy = -1.10407 + (((tickAnim - 18) / 2) * (-7.90718-(-1.10407)));
            zz = -37.38204 + (((tickAnim - 18) / 2) * (-28.71977-(-37.38204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.48 + (((tickAnim - 0) / 1) * (10.18519-(9.48)));
            yy = -57.93 + (((tickAnim - 0) / 1) * (-60.69847-(-57.93)));
            zz = 7.15 + (((tickAnim - 0) / 1) * (6.80148-(7.15)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 10.18519 + (((tickAnim - 1) / 3) * (-7.43432-(10.18519)));
            yy = -60.69847 + (((tickAnim - 1) / 3) * (-73.29438-(-60.69847)));
            zz = 6.80148 + (((tickAnim - 1) / 3) * (21.97308-(6.80148)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.43432 + (((tickAnim - 4) / 4) * (-3.98969-(-7.43432)));
            yy = -73.29438 + (((tickAnim - 4) / 4) * (-83.00146-(-73.29438)));
            zz = 21.97308 + (((tickAnim - 4) / 4) * (20.66042-(21.97308)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.98969 + (((tickAnim - 8) / 2) * (28.39101-(-3.98969)));
            yy = -83.00146 + (((tickAnim - 8) / 2) * (-75.77733-(-83.00146)));
            zz = 20.66042 + (((tickAnim - 8) / 2) * (-23.64249-(20.66042)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 28.39101 + (((tickAnim - 10) / 2) * (86.90517-(28.39101)));
            yy = -75.77733 + (((tickAnim - 10) / 2) * (-84.88668-(-75.77733)));
            zz = -23.64249 + (((tickAnim - 10) / 2) * (-83.46641-(-23.64249)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 86.90517 + (((tickAnim - 12) / 1) * (-13.61392-(86.90517)));
            yy = -84.88668 + (((tickAnim - 12) / 1) * (-44.30587-(-84.88668)));
            zz = -83.46641 + (((tickAnim - 12) / 1) * (25.26972-(-83.46641)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -13.61392 + (((tickAnim - 13) / 0) * (-17.95352-(-13.61392)));
            yy = -44.30587 + (((tickAnim - 13) / 0) * (-13.74767-(-44.30587)));
            zz = 25.26972 + (((tickAnim - 13) / 0) * (29.84083-(25.26972)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -17.95352 + (((tickAnim - 13) / 1) * (9.74162-(-17.95352)));
            yy = -13.74767 + (((tickAnim - 13) / 1) * (-13.15163-(-13.74767)));
            zz = 29.84083 + (((tickAnim - 13) / 1) * (-9.47871-(29.84083)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 9.74162 + (((tickAnim - 14) / 3) * (-13.36-(9.74162)));
            yy = -13.15163 + (((tickAnim - 14) / 3) * (-26.80948-(-13.15163)));
            zz = -9.47871 + (((tickAnim - 14) / 3) * (31.38448-(-9.47871)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -13.36 + (((tickAnim - 17) / 1) * (8.41276-(-13.36)));
            yy = -26.80948 + (((tickAnim - 17) / 1) * (-53.78675-(-26.80948)));
            zz = 31.38448 + (((tickAnim - 17) / 1) * (7.6776-(31.38448)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.41276 + (((tickAnim - 18) / 2) * (9.48-(8.41276)));
            yy = -53.78675 + (((tickAnim - 18) / 2) * (-57.93-(-53.78675)));
            zz = 7.6776 + (((tickAnim - 18) / 2) * (7.15-(7.6776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 37.22333 + (((tickAnim - 0) / 2) * (52.70509-(37.22333)));
            yy = 5.18294 + (((tickAnim - 0) / 2) * (13.85742-(5.18294)));
            zz = -7.07556 + (((tickAnim - 0) / 2) * (9.66111-(-7.07556)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 52.70509 + (((tickAnim - 2) / 3) * (15.12256-(52.70509)));
            yy = 13.85742 + (((tickAnim - 2) / 3) * (-18.43855-(13.85742)));
            zz = 9.66111 + (((tickAnim - 2) / 3) * (-8.70418-(9.66111)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15.12256 + (((tickAnim - 5) / 2) * (10.71624-(15.12256)));
            yy = -18.43855 + (((tickAnim - 5) / 2) * (-62.5891-(-18.43855)));
            zz = -8.70418 + (((tickAnim - 5) / 2) * (-14.68113-(-8.70418)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 10.71624 + (((tickAnim - 7) / 3) * (0.2824-(10.71624)));
            yy = -62.5891 + (((tickAnim - 7) / 3) * (-64.94375-(-62.5891)));
            zz = -14.68113 + (((tickAnim - 7) / 3) * (-9.87877-(-14.68113)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.2824 + (((tickAnim - 10) / 3) * (17.44789-(0.2824)));
            yy = -64.94375 + (((tickAnim - 10) / 3) * (-37.85393-(-64.94375)));
            zz = -9.87877 + (((tickAnim - 10) / 3) * (-5.79996-(-9.87877)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.44789 + (((tickAnim - 13) / 2) * (42.60409-(17.44789)));
            yy = -37.85393 + (((tickAnim - 13) / 2) * (-15.00902-(-37.85393)));
            zz = -5.79996 + (((tickAnim - 13) / 2) * (4.06908-(-5.79996)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 42.60409 + (((tickAnim - 15) / 5) * (37.22333-(42.60409)));
            yy = -15.00902 + (((tickAnim - 15) / 5) * (5.18294-(-15.00902)));
            zz = 4.06908 + (((tickAnim - 15) / 5) * (-7.07556-(4.06908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -107.04451 + (((tickAnim - 0) / 2) * (-95.5734-(-107.04451)));
            yy = -3.07763 + (((tickAnim - 0) / 2) * (-8.56659-(-3.07763)));
            zz = 116.33544 + (((tickAnim - 0) / 2) * (102.93829-(116.33544)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -95.5734 + (((tickAnim - 2) / 1) * (-63.94022-(-95.5734)));
            yy = -8.56659 + (((tickAnim - 2) / 1) * (37.73334-(-8.56659)));
            zz = 102.93829 + (((tickAnim - 2) / 1) * (59.82093-(102.93829)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -63.94022 + (((tickAnim - 3) / 2) * (-60.28497-(-63.94022)));
            yy = 37.73334 + (((tickAnim - 3) / 2) * (44.33487-(37.73334)));
            zz = 59.82093 + (((tickAnim - 3) / 2) * (57.77198-(59.82093)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -60.28497 + (((tickAnim - 5) / 2) * (-32.93471-(-60.28497)));
            yy = 44.33487 + (((tickAnim - 5) / 2) * (41.64495-(44.33487)));
            zz = 57.77198 + (((tickAnim - 5) / 2) * (31.15201-(57.77198)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -32.93471 + (((tickAnim - 7) / 3) * (0.70204-(-32.93471)));
            yy = 41.64495 + (((tickAnim - 7) / 3) * (31.59873-(41.64495)));
            zz = 31.15201 + (((tickAnim - 7) / 3) * (-1.0307-(31.15201)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.70204 + (((tickAnim - 10) / 3) * (7.78354-(0.70204)));
            yy = 31.59873 + (((tickAnim - 10) / 3) * (3.9451-(31.59873)));
            zz = -1.0307 + (((tickAnim - 10) / 3) * (-9.12952-(-1.0307)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.78354 + (((tickAnim - 13) / 2) * (10.92879-(7.78354)));
            yy = 3.9451 + (((tickAnim - 13) / 2) * (-4.18525-(3.9451)));
            zz = -9.12952 + (((tickAnim - 13) / 2) * (-10.04835-(-9.12952)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10.92879 + (((tickAnim - 15) / 3) * (-124.2658-(10.92879)));
            yy = -4.18525 + (((tickAnim - 15) / 3) * (-12.71452-(-4.18525)));
            zz = -10.04835 + (((tickAnim - 15) / 3) * (130.80956-(-10.04835)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -124.2658 + (((tickAnim - 18) / 2) * (-107.04451-(-124.2658)));
            yy = -12.71452 + (((tickAnim - 18) / 2) * (-3.07763-(-12.71452)));
            zz = 130.80956 + (((tickAnim - 18) / 2) * (116.33544-(130.80956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.56808 + (((tickAnim - 0) / 2) * (-2.57683-(0.56808)));
            yy = -1.7317 + (((tickAnim - 0) / 2) * (-0.61937-(-1.7317)));
            zz = 12.4124 + (((tickAnim - 0) / 2) * (20.98843-(12.4124)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.57683 + (((tickAnim - 2) / 1) * (25.58082-(-2.57683)));
            yy = -0.61937 + (((tickAnim - 2) / 1) * (0.10372-(-0.61937)));
            zz = 20.98843 + (((tickAnim - 2) / 1) * (3.65278-(20.98843)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25.58082 + (((tickAnim - 3) / 2) * (21.73848-(25.58082)));
            yy = 0.10372 + (((tickAnim - 3) / 2) * (0.82681-(0.10372)));
            zz = 3.65278 + (((tickAnim - 3) / 2) * (-13.68287-(3.65278)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 21.73848 + (((tickAnim - 5) / 2) * (-20.99015-(21.73848)));
            yy = 0.82681 + (((tickAnim - 5) / 2) * (6.47036-(0.82681)));
            zz = -13.68287 + (((tickAnim - 5) / 2) * (19.92142-(-13.68287)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -20.99015 + (((tickAnim - 7) / 3) * (4.45586-(-20.99015)));
            yy = 6.47036 + (((tickAnim - 7) / 3) * (-0.56972-(6.47036)));
            zz = 19.92142 + (((tickAnim - 7) / 3) * (4.716-(19.92142)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.45586 + (((tickAnim - 10) / 3) * (0.81824-(4.45586)));
            yy = -0.56972 + (((tickAnim - 10) / 3) * (-0.32337-(-0.56972)));
            zz = 4.716 + (((tickAnim - 10) / 3) * (14.65823-(4.716)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.81824 + (((tickAnim - 13) / 2) * (-2.83482-(0.81824)));
            yy = -0.32337 + (((tickAnim - 13) / 2) * (-0.23895-(-0.32337)));
            zz = 14.65823 + (((tickAnim - 13) / 2) * (41.2876-(14.65823)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.83482 + (((tickAnim - 15) / 3) * (3.91213-(-2.83482)));
            yy = -0.23895 + (((tickAnim - 15) / 3) * (-0.82184-(-0.23895)));
            zz = 41.2876 + (((tickAnim - 15) / 3) * (21.29489-(41.2876)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3.91213 + (((tickAnim - 18) / 2) * (0.56808-(3.91213)));
            yy = -0.82184 + (((tickAnim - 18) / 2) * (-1.7317-(-0.82184)));
            zz = 21.29489 + (((tickAnim - 18) / 2) * (12.4124-(21.29489)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraToxolophosaurus entity = (EntityPrehistoricFloraToxolophosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 4 + (((tickAnim - 0) / 3) * (3-(4)));
            zz = 2 + (((tickAnim - 0) / 3) * (-0.66667-(2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 3 + (((tickAnim - 3) / 2) * (-4-(3)));
            zz = -0.66667 + (((tickAnim - 3) / 2) * (-2-(-0.66667)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -4 + (((tickAnim - 5) / 3) * (-3-(-4)));
            zz = -2 + (((tickAnim - 5) / 3) * (0.66667-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -3 + (((tickAnim - 8) / 2) * (4-(-3)));
            zz = 0.66667 + (((tickAnim - 8) / 2) * (2-(0.66667)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(xx), pelvis.rotateAngleY + (float) Math.toRadians(yy), pelvis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.6 + (((tickAnim - 0) / 2) * (-0.6-(-0.6)));
            yy = 1 + (((tickAnim - 0) / 2) * (1.65-(1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.6 + (((tickAnim - 2) / 1) * (-0.6-(-0.6)));
            yy = 1.65 + (((tickAnim - 2) / 1) * (0.9-(1.65)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.6 + (((tickAnim - 3) / 2) * (-0.6-(-0.6)));
            yy = 0.9 + (((tickAnim - 3) / 2) * (1-(0.9)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.6 + (((tickAnim - 5) / 2) * (-0.6-(-0.6)));
            yy = 1 + (((tickAnim - 5) / 2) * (1.65-(1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.6 + (((tickAnim - 7) / 1) * (-0.6-(-0.6)));
            yy = 1.65 + (((tickAnim - 7) / 1) * (1.68-(1.65)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.6 + (((tickAnim - 8) / 0) * (-0.6-(-0.6)));
            yy = 1.68 + (((tickAnim - 8) / 0) * (0.9-(1.68)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.6 + (((tickAnim - 8) / 2) * (-0.6-(-0.6)));
            yy = 0.9 + (((tickAnim - 8) / 2) * (1-(0.9)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(xx);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(yy);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -6.01007 + (((tickAnim - 0) / 2) * (-6.01463-(-6.01007)));
            yy = -5.99451 + (((tickAnim - 0) / 2) * (-2.99267-(-5.99451)));
            zz = -6.8949 + (((tickAnim - 0) / 2) * (-2.19346-(-6.8949)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.01463 + (((tickAnim - 2) / 1) * (-4.01235-(-6.01463)));
            yy = -2.99267 + (((tickAnim - 2) / 1) * (1.50092-(-2.99267)));
            zz = -2.19346 + (((tickAnim - 2) / 1) * (2.35072-(-2.19346)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.01235 + (((tickAnim - 3) / 2) * (-6.01007-(-4.01235)));
            yy = 1.50092 + (((tickAnim - 3) / 2) * (5.99451-(1.50092)));
            zz = 2.35072 + (((tickAnim - 3) / 2) * (6.8949-(2.35072)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -6.01007 + (((tickAnim - 5) / 2) * (-6.01463-(-6.01007)));
            yy = 5.99451 + (((tickAnim - 5) / 2) * (2.99267-(5.99451)));
            zz = 6.8949 + (((tickAnim - 5) / 2) * (2.19346-(6.8949)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -6.01463 + (((tickAnim - 7) / 1) * (-4.01235-(-6.01463)));
            yy = 2.99267 + (((tickAnim - 7) / 1) * (-1.50092-(2.99267)));
            zz = 2.19346 + (((tickAnim - 7) / 1) * (-2.35072-(2.19346)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.01235 + (((tickAnim - 8) / 2) * (-6.01007-(-4.01235)));
            yy = -1.50092 + (((tickAnim - 8) / 2) * (-5.99451-(-1.50092)));
            zz = -2.35072 + (((tickAnim - 8) / 2) * (-6.8949-(-2.35072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2 + (((tickAnim - 0) / 2) * (-11.0014-(-2)));
            yy = 0.99878 + (((tickAnim - 0) / 2) * (-2.16555-(0.99878)));
            zz = -0.0698 + (((tickAnim - 0) / 2) * (0.06402-(-0.0698)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.0014 + (((tickAnim - 2) / 1) * (-3.5007-(-11.0014)));
            yy = -2.16555 + (((tickAnim - 2) / 1) * (-1.58217-(-2.16555)));
            zz = 0.06402 + (((tickAnim - 2) / 1) * (0.06691-(0.06402)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.5007 + (((tickAnim - 3) / 2) * (-2-(-3.5007)));
            yy = -1.58217 + (((tickAnim - 3) / 2) * (-0.99878-(-1.58217)));
            zz = 0.06691 + (((tickAnim - 3) / 2) * (0.0698-(0.06691)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2 + (((tickAnim - 5) / 2) * (-11.0014-(-2)));
            yy = -0.99878 + (((tickAnim - 5) / 2) * (2.16555-(-0.99878)));
            zz = 0.0698 + (((tickAnim - 5) / 2) * (-0.06402-(0.0698)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.0014 + (((tickAnim - 7) / 1) * (-3.5007-(-11.0014)));
            yy = 2.16555 + (((tickAnim - 7) / 1) * (1.58217-(2.16555)));
            zz = -0.06402 + (((tickAnim - 7) / 1) * (-0.06691-(-0.06402)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.5007 + (((tickAnim - 8) / 2) * (-2-(-3.5007)));
            yy = 1.58217 + (((tickAnim - 8) / 2) * (0.99878-(1.58217)));
            zz = -0.06691 + (((tickAnim - 8) / 2) * (-0.0698-(-0.06691)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.00481 + (((tickAnim - 0) / 2) * (15.00481-(8.00481)));
            yy = -1.98053 + (((tickAnim - 0) / 2) * (-0.66018-(-1.98053)));
            zz = -0.27846 + (((tickAnim - 0) / 2) * (-0.09282-(-0.27846)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15.00481 + (((tickAnim - 2) / 1) * (6.50481-(15.00481)));
            yy = -0.66018 + (((tickAnim - 2) / 1) * (0.66018-(-0.66018)));
            zz = -0.09282 + (((tickAnim - 2) / 1) * (0.09282-(-0.09282)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.50481 + (((tickAnim - 3) / 2) * (8.00481-(6.50481)));
            yy = 0.66018 + (((tickAnim - 3) / 2) * (1.98053-(0.66018)));
            zz = 0.09282 + (((tickAnim - 3) / 2) * (0.27846-(0.09282)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 8.00481 + (((tickAnim - 5) / 2) * (15.00481-(8.00481)));
            yy = 1.98053 + (((tickAnim - 5) / 2) * (0.66018-(1.98053)));
            zz = 0.27846 + (((tickAnim - 5) / 2) * (0.09282-(0.27846)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15.00481 + (((tickAnim - 7) / 1) * (6.50481-(15.00481)));
            yy = 0.66018 + (((tickAnim - 7) / 1) * (-0.66018-(0.66018)));
            zz = 0.09282 + (((tickAnim - 7) / 1) * (-0.09282-(0.09282)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.50481 + (((tickAnim - 8) / 2) * (8.00481-(6.50481)));
            yy = -0.66018 + (((tickAnim - 8) / 2) * (-1.98053-(-0.66018)));
            zz = -0.09282 + (((tickAnim - 8) / 2) * (-0.27846-(-0.09282)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (-1-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 2) / 1) * (1-(-1)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (-5-(1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (-1-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -1 + (((tickAnim - 7) / 1) * (1-(-1)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (-5-(1)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 6 + (((tickAnim - 0) / 3) * (-1-(6)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 2) * (-6-(-1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -6 + (((tickAnim - 5) / 3) * (1-(-6)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 2) * (6-(1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.42007-(0)));
            yy = -18 + (((tickAnim - 0) / 2) * (-5.98533-(-18)));
            zz = 0 + (((tickAnim - 0) / 2) * (-10.02196-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.42007 + (((tickAnim - 2) / 1) * (0-(0.42007)));
            yy = -5.98533 + (((tickAnim - 2) / 1) * (0-(-5.98533)));
            zz = -10.02196 + (((tickAnim - 2) / 1) * (-9-(-10.02196)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (18-(0)));
            zz = -9 + (((tickAnim - 3) / 2) * (0-(-9)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0.42007-(0)));
            yy = 18 + (((tickAnim - 5) / 2) * (5.98533-(18)));
            zz = 0 + (((tickAnim - 5) / 2) * (10.02196-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.42007 + (((tickAnim - 7) / 1) * (0-(0.42007)));
            yy = 5.98533 + (((tickAnim - 7) / 1) * (0-(5.98533)));
            zz = 10.02196 + (((tickAnim - 7) / 1) * (9-(10.02196)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-18-(0)));
            zz = 9 + (((tickAnim - 8) / 2) * (0-(9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9-(0)));
            yy = 8 + (((tickAnim - 0) / 3) * (0-(8)));
            zz = 0 + (((tickAnim - 0) / 3) * (12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 3) / 2) * (0-(9)));
            yy = 0 + (((tickAnim - 3) / 2) * (-8-(0)));
            zz = 12 + (((tickAnim - 3) / 2) * (0-(12)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (9-(0)));
            yy = -8 + (((tickAnim - 5) / 3) * (0-(-8)));
            zz = 0 + (((tickAnim - 5) / 3) * (-12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 9 + (((tickAnim - 8) / 2) * (0-(9)));
            yy = 0 + (((tickAnim - 8) / 2) * (8-(0)));
            zz = -12 + (((tickAnim - 8) / 2) * (0-(-12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.9886 + (((tickAnim - 0) / 3) * (-8.00182-(2.9886)));
            yy = 0.26135 + (((tickAnim - 0) / 3) * (0.10465-(0.26135)));
            zz = -4.99318 + (((tickAnim - 0) / 3) * (-1.99726-(-4.99318)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.00182 + (((tickAnim - 3) / 2) * (2.9886-(-8.00182)));
            yy = 0.10465 + (((tickAnim - 3) / 2) * (-0.26135-(0.10465)));
            zz = -1.99726 + (((tickAnim - 3) / 2) * (4.99318-(-1.99726)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.9886 + (((tickAnim - 5) / 3) * (-8.00182-(2.9886)));
            yy = -0.26135 + (((tickAnim - 5) / 3) * (-0.10465-(-0.26135)));
            zz = 4.99318 + (((tickAnim - 5) / 3) * (1.99726-(4.99318)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.00182 + (((tickAnim - 8) / 2) * (2.9886-(-8.00182)));
            yy = -0.10465 + (((tickAnim - 8) / 2) * (0.26135-(-0.10465)));
            zz = 1.99726 + (((tickAnim - 8) / 2) * (-4.99318-(1.99726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.05331 + (((tickAnim - 0) / 1) * (14.62615-(28.05331)));
            yy = -22.5963 + (((tickAnim - 0) / 1) * (-11.43369-(-22.5963)));
            zz = -14.05829 + (((tickAnim - 0) / 1) * (-17.03632-(-14.05829)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 14.62615 + (((tickAnim - 1) / 1) * (-1.53906-(14.62615)));
            yy = -11.43369 + (((tickAnim - 1) / 1) * (42.81992-(-11.43369)));
            zz = -17.03632 + (((tickAnim - 1) / 1) * (-14.61989-(-17.03632)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.53906 + (((tickAnim - 2) / 1) * (-33.88544-(-1.53906)));
            yy = 42.81992 + (((tickAnim - 2) / 1) * (64.33953-(42.81992)));
            zz = -14.61989 + (((tickAnim - 2) / 1) * (-11.27057-(-14.61989)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -33.88544 + (((tickAnim - 3) / 2) * (1.38941-(-33.88544)));
            yy = 64.33953 + (((tickAnim - 3) / 2) * (35.23273-(64.33953)));
            zz = -11.27057 + (((tickAnim - 3) / 2) * (12.27606-(-11.27057)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 1.38941 + (((tickAnim - 5) / 1) * (7.26982-(1.38941)));
            yy = 35.23273 + (((tickAnim - 5) / 1) * (27.28855-(35.23273)));
            zz = 12.27606 + (((tickAnim - 5) / 1) * (-0.74334-(12.27606)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.26982 + (((tickAnim - 6) / 2) * (18.4348-(7.26982)));
            yy = 27.28855 + (((tickAnim - 6) / 2) * (9.93074-(27.28855)));
            zz = -0.74334 + (((tickAnim - 6) / 2) * (-11.92457-(-0.74334)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 18.4348 + (((tickAnim - 8) / 0) * (21.24689-(18.4348)));
            yy = 9.93074 + (((tickAnim - 8) / 0) * (-0.96642-(9.93074)));
            zz = -11.92457 + (((tickAnim - 8) / 0) * (-17.43452-(-11.92457)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.24689 + (((tickAnim - 8) / 2) * (28.05331-(21.24689)));
            yy = -0.96642 + (((tickAnim - 8) / 2) * (-22.5963-(-0.96642)));
            zz = -17.43452 + (((tickAnim - 8) / 2) * (-14.05829-(-17.43452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-8.14397-(0)));
            yy = -33 + (((tickAnim - 0) / 1) * (-7.38465-(-33)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.19102-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -8.14397 + (((tickAnim - 1) / 1) * (-11.91309-(-8.14397)));
            yy = -7.38465 + (((tickAnim - 1) / 1) * (-62.98036-(-7.38465)));
            zz = 0.19102 + (((tickAnim - 1) / 1) * (-13.20552-(0.19102)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.91309 + (((tickAnim - 2) / 1) * (1.24552-(-11.91309)));
            yy = -62.98036 + (((tickAnim - 2) / 1) * (-49.85523-(-62.98036)));
            zz = -13.20552 + (((tickAnim - 2) / 1) * (0.84092-(-13.20552)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.24552 + (((tickAnim - 3) / 2) * (-1.37769-(1.24552)));
            yy = -49.85523 + (((tickAnim - 3) / 2) * (-30.42401-(-49.85523)));
            zz = 0.84092 + (((tickAnim - 3) / 2) * (-1.32014-(0.84092)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.37769 + (((tickAnim - 5) / 1) * (4.16238-(-1.37769)));
            yy = -30.42401 + (((tickAnim - 5) / 1) * (-28.78808-(-30.42401)));
            zz = -1.32014 + (((tickAnim - 5) / 1) * (28.80851-(-1.32014)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.16238 + (((tickAnim - 6) / 2) * (6.17355-(4.16238)));
            yy = -28.78808 + (((tickAnim - 6) / 2) * (-30.4627-(-28.78808)));
            zz = 28.80851 + (((tickAnim - 6) / 2) * (34.07537-(28.80851)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 6.17355 + (((tickAnim - 8) / 0) * (10.99207-(6.17355)));
            yy = -30.4627 + (((tickAnim - 8) / 0) * (-33.3808-(-30.4627)));
            zz = 34.07537 + (((tickAnim - 8) / 0) * (33.85526-(34.07537)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.99207 + (((tickAnim - 8) / 2) * (0-(10.99207)));
            yy = -33.3808 + (((tickAnim - 8) / 2) * (-33-(-33.3808)));
            zz = 33.85526 + (((tickAnim - 8) / 2) * (0-(33.85526)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25.03479 + (((tickAnim - 0) / 1) * (28.52589-(-25.03479)));
            yy = -5.04277 + (((tickAnim - 0) / 1) * (-2.47393-(-5.04277)));
            zz = -15.32435 + (((tickAnim - 0) / 1) * (-4.15117-(-15.32435)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 28.52589 + (((tickAnim - 1) / 1) * (-13.88035-(28.52589)));
            yy = -2.47393 + (((tickAnim - 1) / 1) * (-1.49705-(-2.47393)));
            zz = -4.15117 + (((tickAnim - 1) / 1) * (4.98822-(-4.15117)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -13.88035 + (((tickAnim - 2) / 1) * (-7.14553-(-13.88035)));
            yy = -1.49705 + (((tickAnim - 2) / 1) * (-4.6427-(-1.49705)));
            zz = 4.98822 + (((tickAnim - 2) / 1) * (-9.63956-(4.98822)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.14553 + (((tickAnim - 3) / 2) * (0.50155-(-7.14553)));
            yy = -4.6427 + (((tickAnim - 3) / 2) * (-6.28757-(-4.6427)));
            zz = -9.63956 + (((tickAnim - 3) / 2) * (-19.39966-(-9.63956)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.50155 + (((tickAnim - 5) / 1) * (8.00224-(0.50155)));
            yy = -6.28757 + (((tickAnim - 5) / 1) * (3.66524-(-6.28757)));
            zz = -19.39966 + (((tickAnim - 5) / 1) * (-36.10118-(-19.39966)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 8.00224 + (((tickAnim - 6) / 1) * (3.65808-(8.00224)));
            yy = 3.66524 + (((tickAnim - 6) / 1) * (11.05305-(3.66524)));
            zz = -36.10118 + (((tickAnim - 6) / 1) * (-43.03432-(-36.10118)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 3.65808 + (((tickAnim - 7) / 1) * (-2.90153-(3.65808)));
            yy = 11.05305 + (((tickAnim - 7) / 1) * (17.5838-(11.05305)));
            zz = -43.03432 + (((tickAnim - 7) / 1) * (-41.65709-(-43.03432)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.90153 + (((tickAnim - 8) / 0) * (-19.98678-(-2.90153)));
            yy = 17.5838 + (((tickAnim - 8) / 0) * (31.18944-(17.5838)));
            zz = -41.65709 + (((tickAnim - 8) / 0) * (-53.20203-(-41.65709)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.98678 + (((tickAnim - 8) / 2) * (-25.03479-(-19.98678)));
            yy = 31.18944 + (((tickAnim - 8) / 2) * (-5.04277-(31.18944)));
            zz = -53.20203 + (((tickAnim - 8) / 2) * (-15.32435-(-53.20203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.38941 + (((tickAnim - 0) / 1) * (7.26982-(1.38941)));
            yy = -35.23273 + (((tickAnim - 0) / 1) * (-27.28855-(-35.23273)));
            zz = -12.27606 + (((tickAnim - 0) / 1) * (0.74334-(-12.27606)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 7.26982 + (((tickAnim - 1) / 2) * (18.4348-(7.26982)));
            yy = -27.28855 + (((tickAnim - 1) / 2) * (-9.93074-(-27.28855)));
            zz = 0.74334 + (((tickAnim - 1) / 2) * (11.92457-(0.74334)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 18.4348 + (((tickAnim - 3) / 0) * (21.24689-(18.4348)));
            yy = -9.93074 + (((tickAnim - 3) / 0) * (0.96642-(-9.93074)));
            zz = 11.92457 + (((tickAnim - 3) / 0) * (17.43452-(11.92457)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.24689 + (((tickAnim - 3) / 2) * (28.05331-(21.24689)));
            yy = 0.96642 + (((tickAnim - 3) / 2) * (22.5963-(0.96642)));
            zz = 17.43452 + (((tickAnim - 3) / 2) * (14.05829-(17.43452)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 28.05331 + (((tickAnim - 5) / 1) * (14.62615-(28.05331)));
            yy = 22.5963 + (((tickAnim - 5) / 1) * (11.43369-(22.5963)));
            zz = 14.05829 + (((tickAnim - 5) / 1) * (17.03632-(14.05829)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 14.62615 + (((tickAnim - 6) / 1) * (-1.53906-(14.62615)));
            yy = 11.43369 + (((tickAnim - 6) / 1) * (-42.81992-(11.43369)));
            zz = 17.03632 + (((tickAnim - 6) / 1) * (14.61989-(17.03632)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -1.53906 + (((tickAnim - 7) / 1) * (-33.88544-(-1.53906)));
            yy = -42.81992 + (((tickAnim - 7) / 1) * (-64.33953-(-42.81992)));
            zz = 14.61989 + (((tickAnim - 7) / 1) * (11.27057-(14.61989)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.88544 + (((tickAnim - 8) / 2) * (1.38941-(-33.88544)));
            yy = -64.33953 + (((tickAnim - 8) / 2) * (-35.23273-(-64.33953)));
            zz = 11.27057 + (((tickAnim - 8) / 2) * (-12.27606-(11.27057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.37769 + (((tickAnim - 0) / 1) * (4.16238-(-1.37769)));
            yy = 30.42401 + (((tickAnim - 0) / 1) * (28.78808-(30.42401)));
            zz = 1.32014 + (((tickAnim - 0) / 1) * (-28.80851-(1.32014)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 4.16238 + (((tickAnim - 1) / 2) * (6.17355-(4.16238)));
            yy = 28.78808 + (((tickAnim - 1) / 2) * (30.4627-(28.78808)));
            zz = -28.80851 + (((tickAnim - 1) / 2) * (-34.07537-(-28.80851)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 6.17355 + (((tickAnim - 3) / 0) * (10.99207-(6.17355)));
            yy = 30.4627 + (((tickAnim - 3) / 0) * (33.3808-(30.4627)));
            zz = -34.07537 + (((tickAnim - 3) / 0) * (-33.85526-(-34.07537)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.99207 + (((tickAnim - 3) / 2) * (0-(10.99207)));
            yy = 33.3808 + (((tickAnim - 3) / 2) * (33-(33.3808)));
            zz = -33.85526 + (((tickAnim - 3) / 2) * (0-(-33.85526)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-8.14397-(0)));
            yy = 33 + (((tickAnim - 5) / 1) * (7.38465-(33)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.19102-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -8.14397 + (((tickAnim - 6) / 1) * (-11.91309-(-8.14397)));
            yy = 7.38465 + (((tickAnim - 6) / 1) * (62.98036-(7.38465)));
            zz = -0.19102 + (((tickAnim - 6) / 1) * (13.20552-(-0.19102)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.91309 + (((tickAnim - 7) / 1) * (1.24552-(-11.91309)));
            yy = 62.98036 + (((tickAnim - 7) / 1) * (49.85523-(62.98036)));
            zz = 13.20552 + (((tickAnim - 7) / 1) * (-0.84092-(13.20552)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.24552 + (((tickAnim - 8) / 2) * (-1.37769-(1.24552)));
            yy = 49.85523 + (((tickAnim - 8) / 2) * (30.42401-(49.85523)));
            zz = -0.84092 + (((tickAnim - 8) / 2) * (1.32014-(-0.84092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.50155 + (((tickAnim - 0) / 1) * (8.00224-(0.50155)));
            yy = 6.28757 + (((tickAnim - 0) / 1) * (-3.66524-(6.28757)));
            zz = 19.39966 + (((tickAnim - 0) / 1) * (36.10118-(19.39966)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 8.00224 + (((tickAnim - 1) / 1) * (3.65808-(8.00224)));
            yy = -3.66524 + (((tickAnim - 1) / 1) * (-11.05305-(-3.66524)));
            zz = 36.10118 + (((tickAnim - 1) / 1) * (43.03432-(36.10118)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.65808 + (((tickAnim - 2) / 1) * (-2.90153-(3.65808)));
            yy = -11.05305 + (((tickAnim - 2) / 1) * (-17.5838-(-11.05305)));
            zz = 43.03432 + (((tickAnim - 2) / 1) * (41.65709-(43.03432)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.90153 + (((tickAnim - 3) / 0) * (-19.98678-(-2.90153)));
            yy = -17.5838 + (((tickAnim - 3) / 0) * (-31.18944-(-17.5838)));
            zz = 41.65709 + (((tickAnim - 3) / 0) * (53.20203-(41.65709)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -19.98678 + (((tickAnim - 3) / 2) * (-25.03479-(-19.98678)));
            yy = -31.18944 + (((tickAnim - 3) / 2) * (5.04277-(-31.18944)));
            zz = 53.20203 + (((tickAnim - 3) / 2) * (15.32435-(53.20203)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -25.03479 + (((tickAnim - 5) / 1) * (28.52589-(-25.03479)));
            yy = 5.04277 + (((tickAnim - 5) / 1) * (2.47393-(5.04277)));
            zz = 15.32435 + (((tickAnim - 5) / 1) * (4.15117-(15.32435)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 28.52589 + (((tickAnim - 6) / 1) * (-13.88035-(28.52589)));
            yy = 2.47393 + (((tickAnim - 6) / 1) * (1.49705-(2.47393)));
            zz = 4.15117 + (((tickAnim - 6) / 1) * (-4.98822-(4.15117)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -13.88035 + (((tickAnim - 7) / 1) * (-7.14553-(-13.88035)));
            yy = 1.49705 + (((tickAnim - 7) / 1) * (4.6427-(1.49705)));
            zz = -4.98822 + (((tickAnim - 7) / 1) * (9.63956-(-4.98822)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.14553 + (((tickAnim - 8) / 2) * (0.50155-(-7.14553)));
            yy = 4.6427 + (((tickAnim - 8) / 2) * (6.28757-(4.6427)));
            zz = 9.63956 + (((tickAnim - 8) / 2) * (19.39966-(9.63956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -50.16836 + (((tickAnim - 0) / 2) * (-40.52759-(-50.16836)));
            yy = 18.22769 + (((tickAnim - 0) / 2) * (-11.57166-(18.22769)));
            zz = -7.90674 + (((tickAnim - 0) / 2) * (-5.2073-(-7.90674)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -40.52759 + (((tickAnim - 2) / 1) * (-31.51233-(-40.52759)));
            yy = -11.57166 + (((tickAnim - 2) / 1) * (-30.33678-(-11.57166)));
            zz = -5.2073 + (((tickAnim - 2) / 1) * (-8.88078-(-5.2073)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -31.51233 + (((tickAnim - 3) / 2) * (-3.46681-(-31.51233)));
            yy = -30.33678 + (((tickAnim - 3) / 2) * (-36.46586-(-30.33678)));
            zz = -8.88078 + (((tickAnim - 3) / 2) * (-2.54547-(-8.88078)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.46681 + (((tickAnim - 5) / 2) * (-8.94792-(-3.46681)));
            yy = -36.46586 + (((tickAnim - 5) / 2) * (7.52692-(-36.46586)));
            zz = -2.54547 + (((tickAnim - 5) / 2) * (-0.43915-(-2.54547)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.94792 + (((tickAnim - 7) / 3) * (-50.16836-(-8.94792)));
            yy = 7.52692 + (((tickAnim - 7) / 3) * (18.22769-(7.52692)));
            zz = -0.43915 + (((tickAnim - 7) / 3) * (-7.90674-(-0.43915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 61.61177 + (((tickAnim - 0) / 2) * (-0.7398-(61.61177)));
            yy = -8.25444 + (((tickAnim - 0) / 2) * (-12.13018-(-8.25444)));
            zz = -3.61548 + (((tickAnim - 0) / 2) * (38.58916-(-3.61548)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.7398 + (((tickAnim - 2) / 1) * (-8.33889-(-0.7398)));
            yy = -12.13018 + (((tickAnim - 2) / 1) * (-13.4534-(-12.13018)));
            zz = 38.58916 + (((tickAnim - 2) / 1) * (20.88629-(38.58916)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.33889 + (((tickAnim - 3) / 2) * (10.70784-(-8.33889)));
            yy = -13.4534 + (((tickAnim - 3) / 2) * (-20.67417-(-13.4534)));
            zz = 20.88629 + (((tickAnim - 3) / 2) * (-17.13976-(20.88629)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 10.70784 + (((tickAnim - 5) / 2) * (37.86521-(10.70784)));
            yy = -20.67417 + (((tickAnim - 5) / 2) * (-7.91586-(-20.67417)));
            zz = -17.13976 + (((tickAnim - 5) / 2) * (-33.6743-(-17.13976)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 37.86521 + (((tickAnim - 7) / 1) * (36.72244-(37.86521)));
            yy = -7.91586 + (((tickAnim - 7) / 1) * (3.40654-(-7.91586)));
            zz = -33.6743 + (((tickAnim - 7) / 1) * (-37.11141-(-33.6743)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 36.72244 + (((tickAnim - 8) / 2) * (61.61177-(36.72244)));
            yy = 3.40654 + (((tickAnim - 8) / 2) * (-8.25444-(3.40654)));
            zz = -37.11141 + (((tickAnim - 8) / 2) * (-3.61548-(-37.11141)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20.02102 + (((tickAnim - 0) / 2) * (-19.42952-(-20.02102)));
            yy = 38.55506 + (((tickAnim - 0) / 2) * (84.17144-(38.55506)));
            zz = -43.90314 + (((tickAnim - 0) / 2) * (-58.37811-(-43.90314)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -19.42952 + (((tickAnim - 2) / 1) * (147.97871-(-19.42952)));
            yy = 84.17144 + (((tickAnim - 2) / 1) * (62.86397-(84.17144)));
            zz = -58.37811 + (((tickAnim - 2) / 1) * (129.41119-(-58.37811)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 147.97871 + (((tickAnim - 3) / 2) * (-3.09974-(147.97871)));
            yy = 62.86397 + (((tickAnim - 3) / 2) * (-6.68375-(62.86397)));
            zz = 129.41119 + (((tickAnim - 3) / 2) * (13.52731-(129.41119)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.09974 + (((tickAnim - 5) / 2) * (-8.35212-(-3.09974)));
            yy = -6.68375 + (((tickAnim - 5) / 2) * (-2.60752-(-6.68375)));
            zz = 13.52731 + (((tickAnim - 5) / 2) * (-12.23292-(13.52731)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.35212 + (((tickAnim - 7) / 3) * (-20.02102-(-8.35212)));
            yy = -2.60752 + (((tickAnim - 7) / 3) * (38.55506-(-2.60752)));
            zz = -12.23292 + (((tickAnim - 7) / 3) * (-43.90314-(-12.23292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfoot, Leftfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.46681 + (((tickAnim - 0) / 2) * (-8.94792-(-3.46681)));
            yy = 36.46586 + (((tickAnim - 0) / 2) * (-7.52692-(36.46586)));
            zz = 2.54547 + (((tickAnim - 0) / 2) * (0.43915-(2.54547)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -8.94792 + (((tickAnim - 2) / 3) * (-50.16836-(-8.94792)));
            yy = -7.52692 + (((tickAnim - 2) / 3) * (-18.22769-(-7.52692)));
            zz = 0.43915 + (((tickAnim - 2) / 3) * (7.90674-(0.43915)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -50.16836 + (((tickAnim - 5) / 2) * (-40.52759-(-50.16836)));
            yy = -18.22769 + (((tickAnim - 5) / 2) * (11.57166-(-18.22769)));
            zz = 7.90674 + (((tickAnim - 5) / 2) * (5.2073-(7.90674)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -40.52759 + (((tickAnim - 7) / 1) * (-31.51233-(-40.52759)));
            yy = 11.57166 + (((tickAnim - 7) / 1) * (30.33678-(11.57166)));
            zz = 5.2073 + (((tickAnim - 7) / 1) * (8.88078-(5.2073)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -31.51233 + (((tickAnim - 8) / 2) * (-3.46681-(-31.51233)));
            yy = 30.33678 + (((tickAnim - 8) / 2) * (36.46586-(30.33678)));
            zz = 8.88078 + (((tickAnim - 8) / 2) * (2.54547-(8.88078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.70784 + (((tickAnim - 0) / 2) * (37.86521-(10.70784)));
            yy = 20.67417 + (((tickAnim - 0) / 2) * (7.91586-(20.67417)));
            zz = 17.13976 + (((tickAnim - 0) / 2) * (33.6743-(17.13976)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 37.86521 + (((tickAnim - 2) / 1) * (36.72244-(37.86521)));
            yy = 7.91586 + (((tickAnim - 2) / 1) * (-3.40654-(7.91586)));
            zz = 33.6743 + (((tickAnim - 2) / 1) * (37.11141-(33.6743)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.72244 + (((tickAnim - 3) / 2) * (61.61177-(36.72244)));
            yy = -3.40654 + (((tickAnim - 3) / 2) * (8.25444-(-3.40654)));
            zz = 37.11141 + (((tickAnim - 3) / 2) * (3.61548-(37.11141)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 61.61177 + (((tickAnim - 5) / 2) * (-0.7398-(61.61177)));
            yy = 8.25444 + (((tickAnim - 5) / 2) * (12.13018-(8.25444)));
            zz = 3.61548 + (((tickAnim - 5) / 2) * (-38.58916-(3.61548)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.7398 + (((tickAnim - 7) / 1) * (-8.33889-(-0.7398)));
            yy = 12.13018 + (((tickAnim - 7) / 1) * (13.4534-(12.13018)));
            zz = -38.58916 + (((tickAnim - 7) / 1) * (-20.88629-(-38.58916)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.33889 + (((tickAnim - 8) / 2) * (10.70784-(-8.33889)));
            yy = 13.4534 + (((tickAnim - 8) / 2) * (20.67417-(13.4534)));
            zz = -20.88629 + (((tickAnim - 8) / 2) * (17.13976-(-20.88629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.09974 + (((tickAnim - 0) / 2) * (-8.35212-(-3.09974)));
            yy = 6.68375 + (((tickAnim - 0) / 2) * (2.60752-(6.68375)));
            zz = -13.52731 + (((tickAnim - 0) / 2) * (12.23292-(-13.52731)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -8.35212 + (((tickAnim - 2) / 3) * (-20.33994-(-8.35212)));
            yy = 2.60752 + (((tickAnim - 2) / 3) * (-38.9731-(2.60752)));
            zz = 12.23292 + (((tickAnim - 2) / 3) * (41.32418-(12.23292)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -20.33994 + (((tickAnim - 5) / 2) * (-19.42952-(-20.33994)));
            yy = -38.9731 + (((tickAnim - 5) / 2) * (-84.17144-(-38.9731)));
            zz = 41.32418 + (((tickAnim - 5) / 2) * (58.37811-(41.32418)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -19.42952 + (((tickAnim - 7) / 1) * (147.97871-(-19.42952)));
            yy = -84.17144 + (((tickAnim - 7) / 1) * (-62.86397-(-84.17144)));
            zz = 58.37811 + (((tickAnim - 7) / 1) * (-129.41119-(58.37811)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 147.97871 + (((tickAnim - 8) / 2) * (-3.09974-(147.97871)));
            yy = -62.86397 + (((tickAnim - 8) / 2) * (6.68375-(-62.86397)));
            zz = -129.41119 + (((tickAnim - 8) / 2) * (-13.52731-(-129.41119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfoot, Rightfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraToxolophosaurus e = (EntityPrehistoricFloraToxolophosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
