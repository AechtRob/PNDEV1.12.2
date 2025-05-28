package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAquaticBugNymph;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelMayflyNymph extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer mayfly;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer gillRight1;
    private final AdvancedModelRenderer gillRight2;
    private final AdvancedModelRenderer gillLeft1;
    private final AdvancedModelRenderer gillLeft2;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer gillRight3;
    private final AdvancedModelRenderer gillRight4;
    private final AdvancedModelRenderer gillLeft4;
    private final AdvancedModelRenderer gillLeft3;
    private final AdvancedModelRenderer abdomen4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer caudalFilament;
    private final AdvancedModelRenderer cube_r17;

    private ModelAnimator animator;


    public ModelMayflyNymph() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.mayfly = new AdvancedModelRenderer(this);
        this.mayfly.setRotationPoint(0.0F, 21.8F, 0.1F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.147F, -1.3285F);
        this.mayfly.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.2F, 0.0228F, -1.2735F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, 0.7F, -0.4F, -1.0F, 1, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 17, 0.2F, -0.6F, -0.6F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.7F, -0.1772F, -1.0735F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 16, 1.0F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 16, -0.6F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.4F, 0.0228F, -1.6735F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.2666F, 0.1509F, -1.0675F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 7, 26, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4F, 0.0228F, -1.6735F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.2666F, -0.1509F, 1.0675F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 7, 26, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -0.1755F, -1.4773F);
        this.mayfly.addChild(thorax);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.0019F, 0.746F);
        this.thorax.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -0.7F, -0.7F, 2, 2, 3, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.7F, -0.0745F, 0.4273F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.48F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.3F, 0.7F, 0.5F);
        this.rightLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.8326F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, -7.5F, -1.6F, 0.0F, 7, 4, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.7F, -0.0745F, 0.4273F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.48F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.3F, 0.7F, 0.5F);
        this.leftLeg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.8326F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 12, 0.5F, -1.6F, 0.0F, 7, 4, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.6F, 1.6255F, 2.4273F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -1.7453F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.7808F, 1.3014F, 0.0009F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, -5.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.6F, 1.6255F, 2.4273F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 1.7453F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7808F, -1.3014F, -0.0009F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 6, 0.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.9F, 1.6255F, 2.8273F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.2618F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6981F, 0.9163F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -5.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.9F, 1.6255F, 2.8273F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.2618F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6981F, -0.9163F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 12, 0.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, false));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, 0.648F, 2.4242F);
        this.thorax.addChild(abdomen1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3499F, -1.6782F);
        this.abdomen1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 19, -1.0F, -0.1F, 1.3F, 2, 1, 2, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 4, -1.0F, -0.6F, 1.3F, 2, 1, 2, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, -0.2166F, 1.4579F);
        this.abdomen1.addChild(abdomen2);
        this.setRotateAngle(abdomen2, -0.1309F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.4403F, 1.1214F);
        this.abdomen2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 0, -1.0F, -0.6F, -1.1F, 2, 1, 2, -0.003F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 27, -1.0F, -0.9F, -1.1F, 2, 1, 2, -0.002F, false));

        this.gillRight1 = new AdvancedModelRenderer(this);
        this.gillRight1.setRotationPoint(-1.0F, 0.1F, 0.5F);
        this.abdomen2.addChild(gillRight1);
        this.setRotateAngle(gillRight1, -0.3927F, 0.829F, 0.0F);
        this.gillRight1.cubeList.add(new ModelBox(gillRight1, 8, 0, -0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillRight2 = new AdvancedModelRenderer(this);
        this.gillRight2.setRotationPoint(-1.0F, 0.1F, 1.3F);
        this.abdomen2.addChild(gillRight2);
        this.setRotateAngle(gillRight2, -0.3927F, 0.829F, 0.0F);
        this.gillRight2.cubeList.add(new ModelBox(gillRight2, 0, 0, -0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillLeft1 = new AdvancedModelRenderer(this);
        this.gillLeft1.setRotationPoint(1.0F, 0.1F, 0.5F);
        this.abdomen2.addChild(gillLeft1);
        this.setRotateAngle(gillLeft1, -0.3927F, -0.829F, 0.0F);
        this.gillLeft1.cubeList.add(new ModelBox(gillLeft1, 8, 0, -0.1F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillLeft2 = new AdvancedModelRenderer(this);
        this.gillLeft2.setRotationPoint(1.0F, 0.1F, 1.3F);
        this.abdomen2.addChild(gillLeft2);
        this.setRotateAngle(gillLeft2, -0.3927F, -0.829F, 0.0F);
        this.gillLeft2.cubeList.add(new ModelBox(gillLeft2, 0, 0, -0.1F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, -0.4803F, 1.7681F);
        this.abdomen2.addChild(abdomen3);
        this.setRotateAngle(abdomen3, -0.3054F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.3895F, 1.3464F);
        this.abdomen3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 23, -1.0F, -0.9F, -1.2093F, 2, 1, 2, -0.004F, false));

        this.gillRight3 = new AdvancedModelRenderer(this);
        this.gillRight3.setRotationPoint(-0.9F, 0.3803F, 0.4319F);
        this.abdomen3.addChild(gillRight3);
        this.setRotateAngle(gillRight3, 0.1037F, 0.8276F, 0.2585F);
        this.gillRight3.cubeList.add(new ModelBox(gillRight3, 19, 17, -0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillRight4 = new AdvancedModelRenderer(this);
        this.gillRight4.setRotationPoint(-0.9F, -0.0197F, 1.2319F);
        this.abdomen3.addChild(gillRight4);
        this.setRotateAngle(gillRight4, 0.1037F, 0.8276F, 0.2585F);
        this.gillRight4.cubeList.add(new ModelBox(gillRight4, 0, 16, -0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillLeft4 = new AdvancedModelRenderer(this);
        this.gillLeft4.setRotationPoint(0.9F, -0.0197F, 1.2319F);
        this.abdomen3.addChild(gillLeft4);
        this.setRotateAngle(gillLeft4, 0.1037F, -0.8276F, -0.2585F);
        this.gillLeft4.cubeList.add(new ModelBox(gillLeft4, 0, 16, -0.1F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillLeft3 = new AdvancedModelRenderer(this);
        this.gillLeft3.setRotationPoint(0.9F, 0.3803F, 0.4319F);
        this.abdomen3.addChild(gillLeft3);
        this.setRotateAngle(gillLeft3, 0.1037F, -0.8276F, -0.2585F);
        this.gillLeft3.cubeList.add(new ModelBox(gillLeft3, 19, 17, -0.1F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.abdomen4 = new AdvancedModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, -0.6448F, 1.6646F);
        this.abdomen3.addChild(abdomen4);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.9973F, -0.247F);
        this.abdomen4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 27, 0.0F, -0.8F, 2.7F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.3F, 1.0607F, -0.5568F);
        this.abdomen4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 6, 0.05F, -0.7F, 1.0F, 1, 1, 2, -0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 15, -0.45F, -0.7F, 1.0F, 1, 1, 2, -0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 27, -0.2F, -0.7F, 1.0F, 1, 1, 2, 0.0F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-0.4F, -1.1027F, 2.853F);
        this.abdomen4.addChild(rightCercus);
        this.setRotateAngle(rightCercus, 0.0F, -0.48F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightCercus.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5219F, -0.403F, 0.2444F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.8F, -0.0314F, -0.0347F, 3, 0, 11, 0.0F, true));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(0.4F, -1.1027F, 2.853F);
        this.abdomen4.addChild(leftCercus);
        this.setRotateAngle(leftCercus, 0.0F, 0.48F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftCercus.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5219F, 0.403F, -0.2444F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.2F, -0.0314F, -0.0347F, 3, 0, 11, 0.0F, false));

        this.caudalFilament = new AdvancedModelRenderer(this);
        this.caudalFilament.setRotationPoint(0.0F, -0.7285F, 3.0125F);
        this.abdomen4.addChild(caudalFilament);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.7258F, -3.2595F);
        this.caudalFilament.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 12, 0.5F, -2.8F, 3.7F, 0, 3, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.mayfly.render(f5);
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.mayfly.offsetY = -1.4F;
        this.mayfly.offsetX = -0.5F;
        this.mayfly.rotateAngleY = (float)Math.toRadians(200);
        this.mayfly.rotateAngleX = (float)Math.toRadians(8);
        this.mayfly.rotateAngleZ = (float)Math.toRadians(-8);
        this.mayfly.scaleChildren = true;
        float scaler = 3.5F;
        this.mayfly.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.mayfly.render(f);
        //Reset rotations, positions and sizing:
        this.mayfly.setScale(1.0F, 1.0F, 1.0F);
        this.mayfly.scaleChildren = false;
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
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.body.offsetY = -0.2F;
        EntityPrehistoricFloraAquaticBugNymph slimon = (EntityPrehistoricFloraAquaticBugNymph) e;


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAquaticBugNymph ee = (EntityPrehistoricFloraAquaticBugNymph) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isInWater()) {
            if (!ee.isAtBottom()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else { //in water but not moving:
                animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
        }
    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAquaticBugNymph entity = (EntityPrehistoricFloraAquaticBugNymph) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(gillRight1, gillRight1.rotateAngleX + (float) Math.toRadians(0), gillRight1.rotateAngleY + (float) (Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*15))), gillRight1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillRight2, gillRight2.rotateAngleX + (float) Math.toRadians(0), gillRight2.rotateAngleY + (float) (Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-40))*15))), gillRight2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillLeft1, gillLeft1.rotateAngleX + (float) Math.toRadians(0), gillLeft1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*15), gillLeft1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillLeft2, gillLeft2.rotateAngleX + (float) Math.toRadians(0), gillLeft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-40))*15), gillLeft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillRight3, gillRight3.rotateAngleX + (float) Math.toRadians(0), gillRight3.rotateAngleY + (float) (Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-80))*15))), gillRight3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillRight4, gillRight4.rotateAngleX + (float) Math.toRadians(0), gillRight4.rotateAngleY + (float) (Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-120))*15))), gillRight4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillLeft4, gillLeft4.rotateAngleX + (float) Math.toRadians(0), gillLeft4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-120))*15), gillLeft4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(gillLeft3, gillLeft3.rotateAngleX + (float) Math.toRadians(0), gillLeft3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400-80))*15), gillLeft3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*2), abdomen4.rotateAngleY + (float) Math.toRadians(0), abdomen4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*2), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*2), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(caudalFilament, caudalFilament.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400))*2), caudalFilament.rotateAngleY + (float) Math.toRadians(0), caudalFilament.rotateAngleZ + (float) Math.toRadians(0));

    }

    
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAquaticBugNymph entity = (EntityPrehistoricFloraAquaticBugNymph) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(mayfly, mayfly.rotateAngleX + (float) Math.toRadians(0), mayfly.rotateAngleY + (float) Math.toRadians(0), mayfly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.94626 + (((tickAnim - 0) / 3) * (12.76514-(25.94626)));
            yy = 18.95525 + (((tickAnim - 0) / 3) * (7.37367-(18.95525)));
            zz = 1.26806 + (((tickAnim - 0) / 3) * (21.86359-(1.26806)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12.76514 + (((tickAnim - 3) / 3) * (25.25201-(12.76514)));
            yy = 7.37367 + (((tickAnim - 3) / 3) * (-28.47705-(7.37367)));
            zz = 21.86359 + (((tickAnim - 3) / 3) * (3.92079-(21.86359)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 25.25201 + (((tickAnim - 6) / 7) * (25.94626-(25.25201)));
            yy = -28.47705 + (((tickAnim - 6) / 7) * (18.95525-(-28.47705)));
            zz = 3.92079 + (((tickAnim - 6) / 7) * (1.26806-(3.92079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 25.25201 + (((tickAnim - 0) / 6) * (25.94626-(25.25201)));
            yy = 28.47705 + (((tickAnim - 0) / 6) * (-18.95525-(28.47705)));
            zz = -3.92079 + (((tickAnim - 0) / 6) * (-1.26806-(-3.92079)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 25.94626 + (((tickAnim - 6) / 4) * (12.76514-(25.94626)));
            yy = -18.95525 + (((tickAnim - 6) / 4) * (-7.37367-(-18.95525)));
            zz = -1.26806 + (((tickAnim - 6) / 4) * (-21.86359-(-1.26806)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.76514 + (((tickAnim - 10) / 3) * (25.25201-(12.76514)));
            yy = -7.37367 + (((tickAnim - 10) / 3) * (28.47705-(-7.37367)));
            zz = -21.86359 + (((tickAnim - 10) / 3) * (-3.92079-(-21.86359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (17.5-(0)));
            yy = 32.5 + (((tickAnim - 6) / 4) * (16.25-(32.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (0-(17.5)));
            yy = 16.25 + (((tickAnim - 10) / 3) * (0-(16.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = -32.5 + (((tickAnim - 0) / 3) * (-16.25-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.5 + (((tickAnim - 3) / 3) * (0-(17.5)));
            yy = -16.25 + (((tickAnim - 3) / 3) * (0-(-16.25)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.25721 + (((tickAnim - 0) / 3) * (10.51575-(12.25721)));
            yy = 21.82878 + (((tickAnim - 0) / 3) * (1.50883-(21.82878)));
            zz = -13.86623 + (((tickAnim - 0) / 3) * (8.05801-(-13.86623)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10.51575 + (((tickAnim - 3) / 3) * (0-(10.51575)));
            yy = 1.50883 + (((tickAnim - 3) / 3) * (-12.5-(1.50883)));
            zz = 8.05801 + (((tickAnim - 3) / 3) * (0-(8.05801)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (12.25721-(0)));
            yy = -12.5 + (((tickAnim - 6) / 7) * (21.82878-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (-13.86623-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (12.25721-(0)));
            yy = 12.5 + (((tickAnim - 0) / 6) * (-21.82878-(12.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (13.86623-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 12.25721 + (((tickAnim - 6) / 4) * (10.51575-(12.25721)));
            yy = -21.82878 + (((tickAnim - 6) / 4) * (-1.50883-(-21.82878)));
            zz = 13.86623 + (((tickAnim - 6) / 4) * (-8.05801-(13.86623)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.51575 + (((tickAnim - 10) / 3) * (0-(10.51575)));
            yy = -1.50883 + (((tickAnim - 10) / 3) * (12.5-(-1.50883)));
            zz = -8.05801 + (((tickAnim - 10) / 3) * (0-(-8.05801)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), abdomen4.rotateAngleY + (float) Math.toRadians(0), abdomen4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562+90))*4));


        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(caudalFilament, caudalFilament.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), caudalFilament.rotateAngleY + (float) Math.toRadians(0), caudalFilament.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAquaticBugNymph e = (EntityPrehistoricFloraAquaticBugNymph) entity;
        animator.update(entity);


    }
}
