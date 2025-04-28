package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPricyclopyge extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Smalltrilo;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Antennae1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Antennae2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r25;

    public ModelPricyclopyge() {
        this.textureWidth = 25;
        this.textureHeight = 25;

        this.Smalltrilo = new AdvancedModelRenderer(this);
        this.Smalltrilo.setRotationPoint(0.0F, 23.1F, 0.0F);
        this.Smalltrilo.cubeList.add(new ModelBox(Smalltrilo, 7, 4, -2.0F, -0.85F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -1.85F, 0.0F);
        this.Smalltrilo.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4051F, -0.2415F, 0.1022F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 15, -0.5F, -1.0F, -1.575F, 1, 2, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, 0.0F, -1.5F, -2.075F, 1, 3, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.15F, -1.0F);
        this.Smalltrilo.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 3, -2.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 3, 1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 13, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1423F, 0.0403F, -1.2324F);
        this.Smalltrilo.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.1768F, 1.0471F, -1.1232F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 17, -0.2901F, -2.0F, -2.1412F, 1, 2, 1, -0.02F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.15F, -1.0F);
        this.Smalltrilo.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5807F, 0.5704F, -0.3405F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 6, -0.5758F, -2.0F, -2.1955F, 1, 2, 1, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.15F, -1.0F);
        this.Smalltrilo.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5807F, -0.5704F, 0.3405F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 6, -0.4242F, -2.0F, -2.1955F, 1, 2, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1423F, 0.0403F, -1.2324F);
        this.Smalltrilo.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.1768F, -1.0471F, 1.1232F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 17, -0.7099F, -2.0F, -2.1412F, 1, 2, 1, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -1.85F, 0.0F);
        this.Smalltrilo.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4051F, 0.2415F, -0.1022F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 15, -0.5F, -1.0F, -1.575F, 1, 2, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 13, -1.0F, -1.5F, -2.075F, 1, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.7735F, -2.774F);
        this.Smalltrilo.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.4399F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.0174F, -1.0522F);
        this.Smalltrilo.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -2.0F, 0.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.Antennae1 = new AdvancedModelRenderer(this);
        this.Antennae1.setRotationPoint(0.2404F, -3.75F, -3.0054F);
        this.Smalltrilo.addChild(Antennae1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0096F, 0.0F, 0.0054F);
        this.Antennae1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -2.0F, 0.0F, 0, 2, 11, 0.0F, false));

        this.Antennae2 = new AdvancedModelRenderer(this);
        this.Antennae2.setRotationPoint(-0.2404F, -3.75F, -3.0054F);
        this.Smalltrilo.addChild(Antennae2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0096F, 0.0F, 0.0054F);
        this.Antennae2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -2.0F, 0.0F, 0, 2, 11, 0.0F, true));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Smalltrilo.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 8, 7, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -0.5F, 1.0F);
        this.Thorax1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.5672F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 13, -2.1F, -0.2F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.5F, 1.0F);
        this.Thorax1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.5672F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 13, 0.1F, -0.2F, -1.0F, 2, 0, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0656F, -0.6869F, 0.75F);
        this.Thorax1.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, -1.4835F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-8.3377F, -1.4878F, 6.5F);
        this.LLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 3, 8.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.0656F, -0.6869F, 0.75F);
        this.Thorax1.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 0.0F, 1.4835F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(8.3377F, -1.4878F, 6.5F);
        this.RLeg2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 3, -10.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.8176F, -0.7275F, 2.0F);
        this.Thorax1.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.0F, 0.0F, -1.4835F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-8.3565F, -1.2372F, 6.5F);
        this.LLeg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 10, 8.475F, -0.25F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.8176F, -0.7275F, 2.0F);
        this.Thorax1.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0F, 0.0F, 1.4835F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(8.3565F, -1.2372F, 6.5F);
        this.RLeg3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 10, -10.475F, -0.25F, -7.0F, 2, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 11, 0, -1.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -0.5F, -1.0F);
        this.Thorax2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.5672F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 9, -2.1F, -0.3F, 1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, -0.5F, -1.0F);
        this.Thorax2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.5672F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 9, -0.9F, -0.3F, 1.0F, 3, 0, 2, 0.0F, false));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 17, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 1, -0.5F, -0.3F, 1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -0.5F, -3.0F);
        this.Thorax3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.5672F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 13, -1.05F, -0.375F, 3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, -0.5F, -3.0F);
        this.Thorax3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.5672F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 3, 13, -0.95F, -0.375F, 3.0F, 2, 0, 2, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.3176F, -0.7275F, 0.5F);
        this.Thorax3.addChild(LLeg5);
        this.setRotateAngle(LLeg5, 0.0F, 0.0F, -1.4835F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-8.3565F, -1.2372F, 6.5F);
        this.LLeg5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1745F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 8.725F, -0.25F, -7.0F, 1, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-0.3176F, -0.7275F, 0.5F);
        this.Thorax3.addChild(RLeg5);
        this.setRotateAngle(RLeg5, 0.0F, 0.0F, 1.4835F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(8.3565F, -1.2372F, 6.5F);
        this.RLeg5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1745F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -9.725F, -0.25F, -7.0F, 1, 0, 1, 0.0F, true));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.5676F, -0.7275F, 1.25F);
        this.Thorax2.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.0F, 0.0F, -1.4835F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-8.3565F, -1.2372F, 6.5F);
        this.LLeg4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 10, 8.475F, -0.25F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-0.5676F, -0.7275F, 1.25F);
        this.Thorax2.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.0F, 0.0F, 1.4835F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(8.3565F, -1.2372F, 6.5F);
        this.RLeg4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 10, -10.475F, -0.25F, -7.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Smalltrilo.render(f5);
    }
        public void renderStaticSuspended(float f) {
            this.setRotateAngle(Smalltrilo, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Thorax1, 0.0F, 0.0F, 0.0F);
            this.Smalltrilo.offsetY = -0.14F;
            this.Smalltrilo.render(0.01F);
            resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Smalltrilo, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Thorax1, 0.0F, 0.0F, 0.0F);
        this.Smalltrilo.offsetY = -0.14F;
        this.Smalltrilo.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Smalltrilo.offsetY = -0.05F;
        this.Smalltrilo.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Smalltrilo.offsetY = -0.8F;
        this.Smalltrilo.offsetX = 0.0F;
        this.Smalltrilo.offsetZ = 2.0F;
        this.Smalltrilo.rotateAngleY = (float)Math.toRadians(120);
        this.Smalltrilo.rotateAngleX = (float)Math.toRadians(0);
        this.Smalltrilo.rotateAngleZ = (float)Math.toRadians(0);
        this.Smalltrilo.scaleChildren = true;
        float scaler = 4.0F;
        this.Smalltrilo.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Smalltrilo, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Thorax1, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Smalltrilo.render(f);
        //Reset rotations, positions and sizing:
        this.Smalltrilo.setScale(1.0F, 1.0F, 1.0F);
        this.Smalltrilo.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.Thorax1, this.Thorax2, this.Thorax3};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(Antennae1, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(Antennae2, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(Antennae1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(Antennae2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.03F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
            this.flap(LLeg2, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(RLeg2, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(LLeg3, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(RLeg3, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(LLeg4, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(RLeg4, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(LLeg5, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(RLeg5, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);


                if (f3 == 0.0F) {
                    this.bob(Smalltrilo, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(Smalltrilo, -speed, 1F, false, f2, 2);
                }

        }
    }
}
