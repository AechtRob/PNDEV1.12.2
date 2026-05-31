package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMinicrania extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r18;

    public ModelMinicrania() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -0.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -2.0F, -5.2F, 5, 2, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 18, -2.0F, -1.0F, -7.825F, 4, 1, 3, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 30, -2.0F, -1.95F, -6.225F, 4, 1, 1, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.2175F, -6.2383F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 20, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.925F, -1.2517F, -6.7577F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6429F, 0.1321F, -0.1741F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 31, 0.0F, -0.5F, -0.5F, 1, 1, 1, -0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.925F, -1.2517F, -6.7577F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6429F, -0.1321F, 0.1741F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, -1.0F, -0.5F, -0.5F, 1, 1, 1, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -7.825F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6545F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 5, -2.0F, 0.0F, 0.0F, 4, 1, 2, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.4562F, -5.4004F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.096F, 0.0094F, -0.3682F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -3.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.4562F, -5.4004F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.096F, -0.0094F, 0.3682F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, 0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.2373F, -0.525F, -4.5244F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.0036F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 15, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.2373F, -0.525F, -4.5244F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.0036F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 15, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -0.525F, -5.2F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7418F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 31, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, -0.525F, -5.2F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7418F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 31, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0005F, -1.6739F, 0.3905F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 18, -2.0005F, -1.3511F, -0.3905F, 4, 3, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0005F, -0.5261F, 0.6095F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 30, -1.0F, -1.25F, -1.0F, 2, 3, 2, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0009F, 0.133F, 1.0851F);
        this.tail.addChild(tail2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4954F, 0.6693F, 2.9347F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0525F, 0.0038F, 0.0012F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 0, 0.0F, -0.35F, -3.0F, 3, 1, 3, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0014F, -1.7998F, 1.553F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3532F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 9, 1.0F, -1.0F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0014F, -1.6956F, 0.2773F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1351F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 24, -1.0F, -0.025F, -0.25F, 2, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5014F, -1.4591F, 0.0244F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0434F, 0.0038F, 0.0012F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 9, 0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0014F, -0.4942F, 2.6167F);
        this.tail2.addChild(tail3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2101F, 2.9077F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 24, -1.0F, -0.875F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.2899F, 1.4077F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 15, -1.0F, -0.45F, -1.5F, 2, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0166F, 2.4524F);
        this.tail3.addChild(tail4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.3065F, 1.4553F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 23, 0.5F, -0.25F, -1.5F, 0, 2, 5, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 30, 0.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

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
