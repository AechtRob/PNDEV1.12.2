package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelPhytophilaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer phytophilaspis;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;

    public ModelPhytophilaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.phytophilaspis = new AdvancedModelRenderer(this);
        this.phytophilaspis.setRotationPoint(0.0F, 23.25F, 1.8F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -0.5F, -5.8F);
        this.phytophilaspis.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.0F, 0.0F, 0.0F);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 24, 10, -3.0F, -0.5F, -1.2F, 6, 1, 1, 0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 18, -2.0F, -0.5F, -6.2F, 4, 1, 5, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -0.6F, -3.2F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0443F, -0.1744F, -0.0077F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 27, -1.9696F, 0.0F, 0.3473F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -0.6F, -3.2F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -2.0F, 0.0F, 2.2F, 2, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 34, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.2F, -0.8F, 0.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 0, -0.3F, 0.0F, -3.0F, 1, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.6F, -3.2F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0443F, 0.1744F, 0.0077F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 7, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.5F, -1.4F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -0.5F, -1.4F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(2.0F, 0.5F, -5.2F);
        this.Cephalon.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, 0.7418F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 14, 19, -3.3244F, -1.0F, -0.7373F, 4, 1, 6, 0.0F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone7.addChild(bone8);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone8.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.7418F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 33, -3.0F, -1.0F, -1.0F, 3, 1, 3, -0.001F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(-2.0F, 0.5F, -5.2F);
        this.Cephalon.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, -0.7418F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 18, -0.6756F, -1.0F, -0.7373F, 4, 1, 6, 0.0F, false));

        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone6.addChild(bone9);
        this.setRotateAngle(bone9, 0.0F, 0.7418F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 6, 0.0F, -1.0F, -1.0F, 3, 1, 3, -0.001F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-1.25F, 0.5F, -3.4F);
        this.Cephalon.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, -0.5672F, -0.0436F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 16, 13, -7.5F, 0.1F, -4.0F, 8, 0, 5, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(1.25F, 0.5F, -3.4F);
        this.Cephalon.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, 0.5672F, 0.0436F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 16, 13, -0.5F, 0.1F, -4.0F, 8, 0, 5, 0.0F, true));

        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, -0.5F, -5.1F);
        this.phytophilaspis.addChild(Thorax);
        this.setRotateAngle(Thorax, 0.0F, 0.0F, 0.0F);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 24, 7, -3.0F, -0.5F, -1.0F, 6, 1, 2, -0.002F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 37, 11, -1.0F, -0.7F, -1.0F, 2, 1, 2, -0.002F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 2, -0.5F, -0.8F, -0.7F, 1, 1, 1, -0.002F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 0, -0.5F, -0.8F, -0.3F, 1, 1, 1, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, 0.5F, -1.0F);
        this.Thorax.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 39, -3.0F, -1.0F, 0.0F, 3, 1, 3, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.0F, 0.5F, -1.0F);
        this.Thorax.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 39, 0.0F, -1.0F, 0.0F, 3, 1, 3, -0.002F, false));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, -0.5F, -4.4F);
        this.phytophilaspis.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 0, -3.0F, -0.5F, 0.0F, 6, 1, 12, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 32, -1.0F, -0.7F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.7F, 5.0F);
        this.Pygidium.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, 0.5F, 0.0F, 3.0F, 1, 1, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 34, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.Pygidium.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-3.0F, 0.5F, 13.0F);
        this.Pygidium.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.3927F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 12, 26, 0.3827F, -1.0F, -6.9239F, 3, 1, 6, -0.002F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.bone2.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, -0.3054F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 25, 0.0872F, -1.0F, -6.9962F, 3, 1, 6, -0.001F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(3.0F, 0.5F, 13.0F);
        this.Pygidium.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, -0.3927F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 24, 27, -3.3827F, -1.0F, -6.9239F, 3, 1, 6, -0.002F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 0.3054F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 24, 0, -3.0872F, -1.0F, -6.9962F, 3, 1, 6, -0.001F, false));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-1.1F, 0.5F, -2.9F);
        this.Pygidium.addChild(legright1);
        this.setRotateAngle(legright1, 0.0F, -0.3054F, -0.1745F);
        this.legright1.cubeList.add(new ModelBox(legright1, -2, 43, -4.3041F, -0.0029F, -1.5F, 5, 0, 2, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(1.1F, 0.5F, -2.9F);
        this.Pygidium.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0F, 0.3054F, 0.1745F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, -2, 43, -0.6959F, -0.0029F, -1.5F, 5, 0, 2, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.1F, 0.5F, -1.4F);
        this.Pygidium.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, -0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, -2, 43, -4.3041F, -0.0029F, -1.5F, 5, 0, 2, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.1F, 0.5F, -1.4F);
        this.Pygidium.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, 0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, -2, 43, -0.6959F, -0.0029F, -1.5F, 5, 0, 2, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.1F, 0.5F, 0.6F);
        this.Pygidium.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.1745F);
        this.legright3.cubeList.add(new ModelBox(legright3, -1, 45, -4.3041F, -0.0029F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.1F, 0.5F, 0.6F);
        this.Pygidium.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.1745F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, -1, 45, -0.6959F, -0.0029F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.1F, 0.5F, 2.6F);
        this.Pygidium.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0F, -0.1745F);
        this.legright4.cubeList.add(new ModelBox(legright4, -1, 45, -4.3041F, -0.0029F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.1F, 0.5F, 2.6F);
        this.Pygidium.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.0F, 0.1745F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, -1, 45, -0.6959F, -0.0029F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.1F, 0.5F, 4.6F);
        this.Pygidium.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.0F, -0.2007F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 46, -3.3041F, -0.0029F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.1F, 0.5F, 4.6F);
        this.Pygidium.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, 0.0F, 0.2007F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 46, -0.6959F, -0.0029F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.1F, 0.5F, 6.6F);
        this.Pygidium.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.0F, -0.2007F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 46, -3.3041F, -0.0029F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.1F, 0.5F, 6.6F);
        this.Pygidium.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, 0.0F, 0.2007F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 46, -0.6959F, -0.0029F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.1F, 0.5F, 8.6F);
        this.Pygidium.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.0F, -0.288F);
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 47, -2.3041F, -0.0029F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.1F, 0.5F, 8.6F);
        this.Pygidium.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, 0.0F, 0.288F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 47, -0.6959F, -0.0029F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-1.1F, 0.5F, 10.6F);
        this.Pygidium.addChild(legright8);
        this.setRotateAngle(legright8, 0.0F, 0.0F, -0.288F);
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 47, -2.3041F, -0.0029F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(1.1F, 0.5F, 10.6F);
        this.Pygidium.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0F, 0.0F, 0.288F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 47, -0.6959F, -0.0029F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.phytophilaspis.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(phytophilaspis, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Cephalon, 0.0F, 0.05F, 0.0F);
        this.phytophilaspis.offsetZ = 0.0F;
        this.phytophilaspis.offsetY = 0.06F;
        this.phytophilaspis.offsetX = 0.0F;
        this.phytophilaspis.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legleft1, this.legleft2, this.legleft3, this.legleft4, this.legleft5, this.legleft6, this.legleft7, this.legleft8};
        AdvancedModelRenderer[] legsR = {this.legright1, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6, this.legright7, this.legright8};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legleft1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legright1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legleft2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legright2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legleft3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legright3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legleft4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legright4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legleft5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legright5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legleft6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legright6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legleft7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legright7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legleft8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legright8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legleft1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legright1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legleft2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legright2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legleft3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legright3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legleft4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legright4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legleft5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legright5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legleft6, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legright6, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legleft7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legright7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legleft8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legright8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
           }

        this.swing(antennaleft, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(antennaright, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}