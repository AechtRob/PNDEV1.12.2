package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelKirgisolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelKirgisolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -1.0F, -5.0F, 3, 1, 6, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.5102F, 0.4442F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 36, -1.5F, 0.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.6411F, -2.553F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 13, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.4711F, -7.7977F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4835F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 40, -0.5F, 0.05F, -1.175F, 2, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 40, -0.5F, 0.0F, -1.0F, 2, 2, 1, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -1.4711F, -7.7977F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4814F, -0.2173F, 0.0193F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 40, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -1.4711F, -7.7977F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.005F, -0.2173F, 0.0193F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 40, 0.0F, 0.0F, -1.0F, 1, 2, 1, -0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.4711F, -7.7977F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 2.005F, 0.2173F, -0.0193F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 40, -1.0F, 0.0F, -1.0F, 1, 2, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.4711F, -7.7977F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.4814F, 0.2173F, -0.0193F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 40, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.825F, -1.9015F, -6.047F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.8214F, 0.1284F, -0.1186F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 37, 0.0F, -1.0F, -0.7F, 1, 1, 1, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.825F, -1.9015F, -6.047F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8214F, -0.1284F, 0.1186F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 37, -1.0F, -1.0F, -0.7F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.9457F, -6.4465F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 36, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -3.3732F, -5.2719F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 19, -0.5F, 0.0F, -1.25F, 3, 2, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -5.8506F, -1.2118F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 2.3562F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 24, 0.5F, -1.0F, -2.0F, 1, 1, 2, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -6.7997F, -1.2532F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.6144F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 31, 0.5F, -1.0F, -2.95F, 1, 1, 3, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -4.5565F, -2.7342F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 24, 0.5F, -0.15F, -0.2F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.5F, -5.0F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 7, -1.5F, 0.0F, -0.3F, 3, 2, 3, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.0F, -5.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 37, -0.5F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.4884F, -0.044F, -2.0104F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0017F, -0.0131F, -0.3066F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, 0.0F, -3.0F, -3.0F, 1, 3, 6, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.4884F, -0.044F, -2.0104F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0017F, 0.0131F, 0.3066F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 8, -1.0F, -3.0F, -3.0F, 1, 3, 6, 0.0F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(1.2763F, -0.65F, -5.3137F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0F, 1.1345F, 0.0F);
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 40, 40, -0.5F, -0.55F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5076F, -0.1F, 3.7934F);
        this.leftSpike.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.7418F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 31, -1.0F, -0.45F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftSpike.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3927F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 35, -0.4F, -0.7F, -0.225F, 1, 1, 3, 0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 0, -0.4F, -0.4F, -0.225F, 1, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-1.2763F, -0.65F, -5.3137F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0F, -1.1345F, 0.0F);
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 40, 40, -0.5F, -0.55F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5076F, -0.1F, 3.7934F);
        this.rightSpike.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.7418F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 31, 0.0F, -0.45F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightSpike.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.3927F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 35, -0.6F, -0.7F, -0.225F, 1, 1, 3, 0.003F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 0, -0.6F, -0.4F, -0.225F, 1, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.8028F, -5.8292F);
        this.main.addChild(jaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.1805F, -0.0101F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.4835F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 28, -0.5F, -1.0F, -0.5F, 2, 1, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.9316F, 0.1395F);
        this.main.addChild(tail);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 2.2575F, 3.8005F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 8, -0.5F, -2.5F, -3.8F, 3, 3, 4, -0.009F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -1.2684F, 0.3605F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 19, 0, -2.0F, -0.125F, 0.0F, 3, 2, 4, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7575F, 3.0213F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.0745F, 1.813F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.0952F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 25, 40, 0.0F, -0.625F, -0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.8511F, 5.1228F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1353F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 24, -0.5F, -0.05F, -5.0F, 2, 2, 4, -0.006F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 1.9865F, 0.1007F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1265F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 28, -1.5F, -2.025F, 0.0F, 2, 2, 4, -0.009F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6828F, 3.5811F);
        this.tail2.addChild(tail3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.3069F, -0.042F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5061F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 18, 0.5F, -0.05F, -0.925F, 0, 3, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.7308F, 3.2509F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.7854F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 31, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.3069F, -0.042F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.48F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 16, -0.5F, -0.4F, -0.6F, 1, 1, 6, 0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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
        //this.main.offsetY = 0.95F;

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


            if (!e.isInWater()) {
                //this.mainfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.01F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
