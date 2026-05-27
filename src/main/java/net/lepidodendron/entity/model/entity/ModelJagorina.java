package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraJagorina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelJagorina extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r18;


    public ModelJagorina() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.3F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.9687F, -0.288F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 35, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.0908F, -0.288F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 25, 0.2403F, 0.0F, 1.4957F, 4, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0908F, 0.288F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 25, -4.2403F, 0.0F, 1.4957F, 4, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.9687F, 0.288F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 35, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7282F, -7.9658F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 29, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -2.0755F, -5.9962F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 35, -2.0F, 0.0F, -2.0F, 2, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 32, -3.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.15F, -1.5372F, -6.2303F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 10, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 10, 1.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4755F, -6.4962F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0654F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -2.0F, -2.0F, 0.05F, 4, 2, 5, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.0755F, -5.9962F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0654F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -3.0F, 0.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.8F, -1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 24, -2.0F, -0.5F, 0.0F, 4, 3, 3, -0.006F, false));
        this.tail.cubeList.add(new ModelBox(tail, 31, 34, 1.0F, -0.75F, 0.475F, 0, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 31, 34, -1.0F, -0.75F, 0.475F, 0, 1, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2224F, 2.4053F);
        this.tail.addChild(tail2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.5438F, 5.0028F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0785F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 25, -1.0F, -1.7F, -5.0F, 3, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.2166F, 2.0919F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 13, 0.0F, -2.0F, 0.7F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.6724F, 0.0948F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 0, -1.0F, 0.0F, 0.0F, 3, 2, 4, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.4724F, 2.5697F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 17, 0.0F, -0.425F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 17, 2.0F, -0.425F, -0.5F, 0, 1, 1, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6854F, 2.0798F, 2.0047F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.035F, -0.2595F, 0.17F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 31, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.6854F, 2.0798F, 2.0047F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.035F, 0.2595F, -0.17F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 31, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0724F, 3.5947F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 8, -1.0F, -0.25F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -0.0638F, 1.957F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0007F, 0.1304F, -0.0115F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 35, 0.4F, -0.45F, -1.325F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -0.0638F, 1.957F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0007F, -0.1304F, 0.0115F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 35, -0.4F, -0.45F, -1.325F, 0, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.35F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 16, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.1669F, -6.3288F);
        this.main.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.6446F, -0.1175F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 7, -1.0F, -1.0F, -1.975F, 2, 1, 1, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 34, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.1519F, -0.5276F, -2.6139F);
        this.main.addChild(frontLeftFin);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, 0.325F, 0.0F);
        this.frontLeftFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -2.5F, 0.0F, -3.5F, 5, 0, 7, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.1519F, -0.5276F, -2.6139F);
        this.main.addChild(frontRightFin);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, 0.325F, 0.0F);
        this.frontRightFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.1309F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -2.5F, 0.0F, -3.5F, 5, 0, 7, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.13F;
        this.main.offsetY = -0.22F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.9F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
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
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraJagorina ee = (EntityPrehistoricFloraJagorina) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.main.offsetY = 1.35F - 1.05F;
                this.main.rotateAngleX = -(float) Math.toRadians(30);
                swaymodifier = 0;
            }
            else {
                this.main.offsetY = 1.05F - 1.05F + (0.08F * (float)((double)ee.getBuriedTick()/60D));
                this.main.rotateAngleX = -(float) Math.toRadians(30 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.main.offsetY = 1.05F - 1.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

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
            speed = 0.15F * speedmodifier;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.05F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.0F - 1.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
