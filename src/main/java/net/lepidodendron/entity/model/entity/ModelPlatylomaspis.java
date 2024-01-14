package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatylomaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPlatylomaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Platylomaspis;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer MedialOpening_r1;
    private final AdvancedModelRenderer Ventralrim;
    private final AdvancedModelRenderer CheekL;
    private final AdvancedModelRenderer leftHead;
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
    private final AdvancedModelRenderer CheekR;
    private final AdvancedModelRenderer Rostrum;
    private final AdvancedModelRenderer BodyStatic;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Tail;

    public ModelPlatylomaspis() {
        this.textureWidth = 80;
        this.textureHeight = 75;

        this.Platylomaspis = new AdvancedModelRenderer(this);
        this.Platylomaspis.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Platylomaspis.addChild(body);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -6.0F, 9.0F);
        this.body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 12, -4.0F, -1.6F, -15.0F, 8, 2, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -4.5F, -0.3F, -16.0F, 9, 1, 10, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 32, 37, -3.0F, -2.0F, -14.0F, 6, 1, 7, 0.0F, false));

        this.MedialOpening_r1 = new AdvancedModelRenderer(this);
        this.MedialOpening_r1.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.Cephalon.addChild(MedialOpening_r1);
        this.setRotateAngle(MedialOpening_r1, -0.7418F, 0.0F, 0.0F);
        this.MedialOpening_r1.cubeList.add(new ModelBox(MedialOpening_r1, 59, 16, -4.0F, -1.2F, -1.0F, 8, 2, 1, -0.01F, false));

        this.Ventralrim = new AdvancedModelRenderer(this);
        this.Ventralrim.setRotationPoint(0.0F, 6.0F, -9.0F);
        this.Cephalon.addChild(Ventralrim);
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 57, 44, -3.0F, -6.0F, 0.0F, 6, 1, 2, 0.0F, false));

        this.CheekL = new AdvancedModelRenderer(this);
        this.CheekL.setRotationPoint(4.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekL);
        this.setRotateAngle(CheekL, 0.0F, 0.0F, 0.1309F);


        this.leftHead = new AdvancedModelRenderer(this);
        this.leftHead.setRotationPoint(-4.0F, 6.0F, 0.0F);
        this.CheekL.addChild(leftHead);
        this.leftHead.cubeList.add(new ModelBox(leftHead, 25, 15, 0.0F, -5.9F, -8.0F, 6, 1, 8, 0.0F, false));
        this.leftHead.cubeList.add(new ModelBox(leftHead, 0, 33, 3.0F, -6.0F, -4.0F, 5, 1, 8, 0.0F, false));
        this.leftHead.cubeList.add(new ModelBox(leftHead, 50, 8, 6.4F, -6.0F, -4.0F, 4, 1, 6, 0.005F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.0062F, -3.7882F, 6.8935F);
        this.leftHead.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0036F, -0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 54, -5.7374F, -0.6082F, -2.8209F, 6, 1, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 49, -9.3478F, -1.2849F, 10.258F, 4, 1, 6, 0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5236F, -0.2182F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 0, -2.886F, -1.2849F, 7.8576F, 4, 1, 6, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, -0.7854F, -0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 43, -0.6929F, -0.5669F, -0.5019F, 2, 1, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(5.3996F, -5.5F, 5.4826F);
        this.leftHead.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 57, -0.5F, -0.5F, -0.7F, 6, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.3498F, -4.8F, 2.7413F);
        this.leftHead.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.5272F, -0.2618F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -4.8281F, -0.5F, -3.4283F, 4, 1, 3, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.3498F, -4.8F, 2.7413F);
        this.leftHead.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 0, -4.6502F, -0.5F, -6.7413F, 5, 1, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(5.0F, -5.5F, 5.5F);
        this.leftHead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.5272F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 48, -2.0F, -0.5F, -1.9F, 4, 1, 3, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(6.6359F, -5.5F, -8.2401F);
        this.leftHead.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 16, -1.0F, -0.5F, -8.7426F, 2, 1, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(11.0F, 0.0F, -4.0F);
        this.leftHead.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 27, -4.6F, -6.0F, -6.0F, 4, 1, 6, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 23, -6.1F, -0.4F, -0.25F, 6, 1, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -3.1F, -0.5F, -4.25F, 3, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, -2.1F, -0.5F, -5.25F, 2, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 12, -4.1F, -0.5F, -3.25F, 4, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 10, -6.1F, -0.5F, -2.25F, 6, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 20, -2.0F, -0.5F, -2.25F, 6, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 43, -2.0F, -0.5F, -3.25F, 4, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 3, -2.0F, -0.5F, -4.25F, 3, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, -2.0F, -0.5F, -5.25F, 2, 1, 1, 0.0F, false));

        this.CheekR = new AdvancedModelRenderer(this);
        this.CheekR.setRotationPoint(-3.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekR);
        this.setRotateAngle(CheekR, 0.0F, 0.0F, -0.1309F);


        this.Rostrum = new AdvancedModelRenderer(this);
        this.Rostrum.setRotationPoint(0.0F, -5.0F, -9.0F);
        this.Ventralrim.addChild(Rostrum);
        this.setRotateAngle(Rostrum, 0.0436F, 0.0F, 0.0F);
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 42, 27, -1.5F, -1.0F, -5.9F, 3, 1, 2, 0.0F, false));
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 17, 37, -1.0F, -1.0F, -15.8F, 2, 1, 10, 0.0F, false));

        this.BodyStatic = new AdvancedModelRenderer(this);
        this.BodyStatic.setRotationPoint(0.0F, 6.0F, -9.0F);
        this.Cephalon.addChild(BodyStatic);
        this.BodyStatic.cubeList.add(new ModelBox(BodyStatic, 22, 26, -3.0F, -8.0F, 2.0F, 6, 3, 7, 0.0F, false));
        this.BodyStatic.cubeList.add(new ModelBox(BodyStatic, 44, 58, 0.0F, -11.0F, 3.0F, 0, 3, 6, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -7.0F, 9.0F);
        this.body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 21, 62, 0.0F, -3.4F, 0.0F, 0, 3, 5, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 36, 45, -2.5F, -1.0F, -1.0F, 5, 3, 6, -0.003F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 51, 34, -2.0F, -2.0F, -1.0F, 4, 3, 6, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 61, 56, 0.0F, -4.8F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 54, -1.0F, -1.0F, -1.0F, 2, 3, 6, -0.003F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 10, 59, 0.0F, -3.6F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 64, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 51, 48, 0.0F, -1.0F, 0.0F, 0, 5, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Platylomaspis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Platylomaspis.rotateAngleY = (float) Math.toRadians(90);
        this.Platylomaspis.offsetY = -0.03F;
        this.Platylomaspis.offsetX = -0.05F;
        this.Platylomaspis.offsetZ = -0.37F;
        this.Platylomaspis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Platylomaspis, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(Body3, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.2F, -0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.2F, -0.1F, 0.0F);
        this.Platylomaspis.offsetY = 0.1F;
        this.Platylomaspis.render(0.01F);
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
        //this.Platylomaspis.offsetY = 1.25F;

        EntityPrehistoricFloraPlatylomaspis ee = (EntityPrehistoricFloraPlatylomaspis) e;

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.Platylomaspis.offsetY = 1.60F;
                this.Platylomaspis.rotateAngleX = (float) Math.toRadians(90);
                swaymodifier = 0;
            }
            else {
                this.Platylomaspis.offsetY = 1.25F + (0.35F * (float)((double)ee.getBuriedTick()/60D));
                this.Platylomaspis.rotateAngleX = (float) Math.toRadians(90 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.Platylomaspis.offsetY = -0.25F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Tail};

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
            this.chainWave(fishTail, speed, 0.05F, -2.5, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.5, f2, 1);
            this.swing(Platylomaspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Platylomaspis.offsetY = 1.25F - 1.25F;
                this.bob(Platylomaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -2.5, f2, 1);
            }
        }
    }
}
