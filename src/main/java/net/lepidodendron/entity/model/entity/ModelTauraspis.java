package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTauraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Tauraspis;
    private final AdvancedModelRenderer Sclerodus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Leftside;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Rightside;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelTauraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Tauraspis = new AdvancedModelRenderer(this);
        this.Tauraspis.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Sclerodus = new AdvancedModelRenderer(this);
        this.Sclerodus.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tauraspis.addChild(Sclerodus);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Sclerodus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 9, 18, -0.5F, -1.1F, -9.25F, 1, 1, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 10, -0.5F, -0.9F, -9.25F, 1, 1, 2, -0.0021F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2269F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 26, -0.5F, -0.022F, -0.0299F, 1, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.1F, 0.1F, -2.75F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -0.0839F, -1.0F, 0.0328F, 5, 1, 4, 0.001F, false));

        this.Leftside = new AdvancedModelRenderer(this);
        this.Leftside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Leftside);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.2F, -1.1F);
        this.Leftside.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2487F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 6, -0.0843F, 0.0F, -0.0329F, 2, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.1F, 0.0F, 3.9F);
        this.Leftside.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.9468F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 18, 0.0702F, 0.2F, -2.7461F, 1, 1, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 0.0F, 3.7F);
        this.Leftside.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.9468F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 18, -0.6298F, 0.2F, -2.1461F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.5F, 0.0F, -4.1F);
        this.Leftside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2408F, 0.8429F, 0.3178F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 14, -0.3808F, 0.3F, -1.01F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.2F, 0.0F, -0.9F);
        this.Leftside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.3395F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 11, -0.5311F, 0.2F, -0.5806F, 4, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.1F, 0.0F, -0.1F);
        this.Leftside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.2523F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 6, -0.4F, 0.2F, -1.4F, 4, 1, 3, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.2F, -0.739F, 0.3695F);
        this.Leftside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2336F, -0.0953F, 0.0922F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 24, -1.7796F, 0.978F, 2.4416F, 2, 1, 2, -0.0012F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 10, -1.7796F, 0.878F, -0.2584F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.2F, -0.739F, 3.3695F);
        this.Leftside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2161F, -0.0936F, 0.0939F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, -2.0649F, 0.1868F, -0.4637F, 2, 1, 2, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, -1.439F, 3.2695F);
        this.Leftside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1989F, -0.0215F, 0.1644F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, -0.9F, 0.7457F, -0.4153F, 1, 1, 1, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.4F, 0.661F, 3.4195F);
        this.Leftside.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.48F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 18, 18, -1.1154F, 0.0F, -0.7782F, 2, 0, 5, 0.0F, false));

        this.Rightside = new AdvancedModelRenderer(this);
        this.Rightside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Rightside);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.2F, -1.1F);
        this.Rightside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2487F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 6, -1.9157F, 0.0F, -0.0329F, 2, 1, 1, -0.001F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.1F, 0.0F, 3.9F);
        this.Rightside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.9468F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 18, -1.0702F, 0.2F, -2.7461F, 1, 1, 1, 0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 0.0F, 3.7F);
        this.Rightside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.9468F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 18, -0.3702F, 0.2F, -2.1461F, 1, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.5F, 0.0F, -4.1F);
        this.Rightside.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2408F, -0.8429F, -0.3178F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 14, -1.6192F, 0.3F, -1.01F, 2, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.2F, 0.0F, -0.9F);
        this.Rightside.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.3395F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 11, -3.4689F, 0.2F, -0.5806F, 4, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.1F, 0.0F, -0.1F);
        this.Rightside.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.2523F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 6, -3.6F, 0.2F, -1.4F, 4, 1, 3, -0.0023F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.2F, -0.739F, 0.3695F);
        this.Rightside.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2336F, 0.0953F, -0.0922F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 24, -0.2204F, 0.978F, 2.4416F, 2, 1, 2, -0.0012F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 10, -0.2204F, 0.878F, -0.2584F, 2, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.2F, -0.739F, 3.3695F);
        this.Rightside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2161F, 0.0936F, -0.0939F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 31, -4.2965F, -0.3038F, -0.7753F, 2, 1, 2, -0.001F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -1.439F, 3.2695F);
        this.Rightside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1989F, 0.0215F, -0.1644F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 22, -0.1F, 0.7457F, -0.4153F, 1, 1, 1, 0.0F, true));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.4F, 0.661F, 3.4195F);
        this.Rightside.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.48F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 18, 18, -0.8846F, 0.0F, -0.7782F, 2, 0, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1F, -1.3F, -3.1F);
        this.Head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.9F, -0.8F, -0.05F, 4, 2, 7, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.1F, 0.45F, 7.05F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 10, -1.5F, -1.25F, -0.4F, 3, 2, 5, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 24, -1.0F, -1.25F, -0.1F, 2, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.55F, 0.85F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5934F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, -3.7F, 0.05F, 0, 4, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.7F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 22, -0.5F, -1.0F, -0.3F, 1, 2, 5, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 4.7F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 10, 0.0F, -2.0F, 0.0F, 0, 4, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Tauraspis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Tauraspis.rotateAngleX = (float) Math.toRadians(90);
        this.Tauraspis.offsetY = -0.2F;
        this.Tauraspis.offsetX = -0.0F;
        this.Tauraspis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Tauraspis.offsetY = 0.15F;
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2161F, -0.0936F, 0.0939F);
        this.setRotateAngle(cube_r11, 0.1989F, -0.0215F, 0.1644F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2487F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.9468F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.9468F, 0.0F);
        this.setRotateAngle(cube_r15, 0.2408F, -0.8429F, -0.3178F);
        this.setRotateAngle(cube_r16, 0.0F, -1.3395F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, 1.2523F, 0.0F);
        this.setRotateAngle(cube_r18, 0.2336F, 0.0953F, -0.0922F);
        this.setRotateAngle(cube_r19, 0.2161F, 0.0936F, -0.0939F);
        this.setRotateAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1989F, 0.0215F, -0.1644F);
        this.setRotateAngle(cube_r21, -0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.2487F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, -0.9468F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.9468F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2408F, 0.8429F, 0.3178F);
        this.setRotateAngle(cube_r7, 0.0F, 1.3395F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -1.2523F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2336F, -0.0953F, 0.0922F);
        this.setRotateAngle(PectoralL, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(tail2, 0.0436F, 0.3054F, 0.0F);
        this.setRotateAngle(tail3, 0.0436F, 0.3491F, 0.0F);
        this.setRotateAngle(tail4, 0.0436F, 0.2618F, 0.0F);
        this.Tauraspis.render(0.01F);
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
        //this.Tauraspis.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4, this.tail5};

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
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.flap(PectoralL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(PectoralR, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.0F;
                this.bob(Tauraspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
