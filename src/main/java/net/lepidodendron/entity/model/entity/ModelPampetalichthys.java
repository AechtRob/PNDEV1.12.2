package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPampetalichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
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
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    public ModelPampetalichthys() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 32, 28, -0.5F, -1.0F, -8.0F, 1, 1, 1, 0.009F, false));
        this.main.cubeList.add(new ModelBox(main, 28, 0, -1.0F, -2.4156F, -2.2119F, 2, 2, 2, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 28, -1.0F, -1.0F, -7.0F, 2, 1, 1, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 23, -1.5F, -0.825F, -6.025F, 3, 1, 3, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 0, -2.0F, -2.0F, -4.0F, 4, 2, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 6, -2.0F, -0.8F, -4.0F, 4, 1, 3, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 30, 5, -1.0F, -0.8F, -1.025F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.2779F, 0.0F, -7.9744F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.9294F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 34, -1.075F, -1.0F, -0.1F, 1, 1, 1, 0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1999F, -0.5F, -6.5746F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6676F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 31, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.6043F, -0.5F, -6.7408F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.2785F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 28, -2.0F, -0.5F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.1807F, -0.5F, -4.8257F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.7584F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 31, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.1807F, -0.5F, -4.8257F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.7584F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 31, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.6043F, -0.5F, -6.7408F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.2785F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 28, 0.0F, -0.5F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1999F, -0.5F, -6.5746F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6676F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 31, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.2779F, 0.0F, -7.9744F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.9294F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 34, 0.075F, -1.0F, -0.1F, 1, 1, 1, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.6205F, -1.0F, -3.0276F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.8727F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 8, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.006F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.7727F, -1.0F, -3.7929F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 32, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-4.2378F, -1.0F, -2.1037F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 31, 0.0F, 0.0F, -1.0F, 2, 1, 1, -0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -1.0F, -4.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 28, -0.8F, 0.0F, 0.0F, 1, 1, 3, 0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.6205F, -1.0F, -3.0276F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.8727F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 8, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.2378F, -1.0F, -2.1037F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 31, -2.0F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.7727F, -1.0F, -3.7929F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 32, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, -1.0F, -4.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2618F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -0.2F, 0.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -2.024F, -5.1863F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 17, -2.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.903F, -1.0911F, -6.4825F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3037F, 0.37F, -0.1313F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 34, -0.5F, -0.525F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.903F, -1.0911F, -6.4825F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3037F, -0.37F, 0.1313F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 34, -0.5F, -0.525F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.4226F, -7.0937F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 11, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -1.0F, -8.0F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 33, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.575F, -5.9375F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 34, -0.5F, -0.25F, -2.0375F, 1, 1, 1, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 28, -1.0F, -0.25F, -1.0625F, 2, 1, 1, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.7809F, -0.2544F, -2.4115F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0436F, 0.5236F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 13, 23, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.7809F, -0.2544F, -2.4115F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0436F, -0.5236F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 13, 23, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9249F, -1.0737F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -1.5F, -0.9751F, -0.4263F, 3, 2, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -1.3407F, 0.8618F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1702F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 23, -2.0F, 0.05F, -1.0F, 2, 1, 3, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 5, 33, -1.0F, -0.45F, 0.025F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.9104F, 3.0708F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0829F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 31, 34, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0249F, 3.0263F);
        this.tail.addChild(tail2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.4447F, 3.9451F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 17, -1.0F, -0.925F, -3.95F, 2, 1, 4, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.9001F, 0.0474F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 11, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0501F, 3.5474F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -0.25F, 0.25F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 1.0F, -0.275F, -0.05F, 0, 3, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.25F, 0.25F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 17, 0.0F, -0.25F, -0.25F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.setRotateAngle(main, 1.5F, 0.0F, 1.5F);
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.0F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();


    }
    public void renderStaticSuspended(float f) {

        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 0.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }


}
