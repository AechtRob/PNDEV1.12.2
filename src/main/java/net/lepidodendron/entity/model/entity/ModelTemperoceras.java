package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTemperoceras extends AdvancedModelBase {
    private final AdvancedModelRenderer wholething;
    private final AdvancedModelRenderer allarms;
    private final AdvancedModelRenderer top;
    private final AdvancedModelRenderer top2;
    private final AdvancedModelRenderer bottom;
    private final AdvancedModelRenderer bottom2;
    private final AdvancedModelRenderer bottomright;
    private final AdvancedModelRenderer bottomright2;
    private final AdvancedModelRenderer topright;
    private final AdvancedModelRenderer topright2;
    private final AdvancedModelRenderer topleft3;
    private final AdvancedModelRenderer topleft4;
    private final AdvancedModelRenderer bottomleft;
    private final AdvancedModelRenderer bottomleft2;
    private final AdvancedModelRenderer topmiddleright;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer topmiddleright2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer topmiddleleft;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer topmiddleleft2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bottommiddleright;
    private final AdvancedModelRenderer bottommiddleright2;
    private final AdvancedModelRenderer bottommiddleleft;
    private final AdvancedModelRenderer bottommiddleleft2;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer siphon_r1;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer bottomhalfshell_r1;

    //private ModelAnimator animator;

    public ModelTemperoceras() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.wholething = new AdvancedModelRenderer(this);
        this.wholething.setRotationPoint(-1.5F, 11.0F, 8.0F);
        this.setRotateAngle(wholething, -1.6144F, 3.1416F, 0.0F);
        this.wholething.cubeList.add(new ModelBox(wholething, 37, 0, -6.5F, -1.6997F, -2.6131F, 1, 3, 3, 0.0F, false));
        this.wholething.cubeList.add(new ModelBox(wholething, 64, 58, 2.5F, -1.6997F, -2.6131F, 1, 3, 3, 0.0F, false));
        this.wholething.cubeList.add(new ModelBox(wholething, 78, 0, -5.5F, -4.2F, -6.5F, 8, 8, 2, 0.0F, false));
        this.wholething.cubeList.add(new ModelBox(wholething, 64, 58, -6.0F, -5.2997F, -4.9131F, 9, 9, 9, 0.0F, false));

        this.allarms = new AdvancedModelRenderer(this);
        this.allarms.setRotationPoint(-1.0F, 16.7F, 0.9F);
        this.wholething.addChild(allarms);


        this.top = new AdvancedModelRenderer(this);
        this.top.setRotationPoint(-0.5F, -13.0F, -4.5F);
        this.allarms.addChild(top);
        this.setRotateAngle(top, -0.3054F, 0.0F, 0.0F);
        this.top.cubeList.add(new ModelBox(top, 94, 19, -0.5F, 0.0585F, -0.5362F, 1, 8, 1, 0.0F, false));

        this.top2 = new AdvancedModelRenderer(this);
        this.top2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.top.addChild(top2);
        this.top2.cubeList.add(new ModelBox(top2, 86, 10, -0.5F, -0.1022F, -0.5113F, 1, 16, 1, -0.1F, false));

        this.bottom = new AdvancedModelRenderer(this);
        this.bottom.setRotationPoint(-0.5F, -13.0F, 1.85F);
        this.allarms.addChild(bottom);
        this.setRotateAngle(bottom, 0.3054F, 0.0F, 0.0F);
        this.bottom.cubeList.add(new ModelBox(bottom, 82, 44, -0.5F, -0.0014F, -0.5625F, 1, 8, 1, 0.0F, false));

        this.bottom2 = new AdvancedModelRenderer(this);
        this.bottom2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.bottom.addChild(bottom2);
        this.bottom2.cubeList.add(new ModelBox(bottom2, 78, 10, -0.5F, -0.4054F, -0.6064F, 1, 16, 1, -0.1F, false));

        this.bottomright = new AdvancedModelRenderer(this);
        this.bottomright.setRotationPoint(1.5F, -13.0F, 1.5F);
        this.allarms.addChild(bottomright);
        this.setRotateAngle(bottomright, 0.2618F, 0.3491F, 0.0F);
        this.bottomright.cubeList.add(new ModelBox(bottomright, 86, 44, -0.5516F, -0.1591F, -0.4447F, 1, 8, 1, 0.0F, false));

        this.bottomright2 = new AdvancedModelRenderer(this);
        this.bottomright2.setRotationPoint(0.0F, 7.85F, 0.0F);
        this.bottomright.addChild(bottomright2);
        this.bottomright2.cubeList.add(new ModelBox(bottomright2, 78, 27, -0.5624F, -0.1842F, -0.4173F, 1, 16, 1, -0.1F, false));

        this.topright = new AdvancedModelRenderer(this);
        this.topright.setRotationPoint(-2.5F, -13.0F, 1.5F);
        this.allarms.addChild(topright);
        this.setRotateAngle(topright, 0.3491F, -2.4871F, 0.0F);
        this.topright.cubeList.add(new ModelBox(topright, 86, 44, -4.0F, 0.8409F, 3.5553F, 1, 8, 1, 0.0F, true));

        this.topright2 = new AdvancedModelRenderer(this);
        this.topright2.setRotationPoint(0.0F, 7.85F, 0.0F);
        this.topright.addChild(topright2);
        this.topright2.cubeList.add(new ModelBox(topright2, 78, 27, -4.0F, -0.1842F, 3.5827F, 1, 16, 1, -0.1F, true));

        this.topleft3 = new AdvancedModelRenderer(this);
        this.topleft3.setRotationPoint(1.5F, -13.0F, 1.5F);
        this.allarms.addChild(topleft3);
        this.setRotateAngle(topleft3, 0.3491F, 2.4871F, 0.0F);
        this.topleft3.cubeList.add(new ModelBox(topleft3, 86, 44, 3.0F, 0.8409F, 3.5553F, 1, 8, 1, 0.0F, false));

        this.topleft4 = new AdvancedModelRenderer(this);
        this.topleft4.setRotationPoint(0.0F, 7.85F, 0.0F);
        this.topleft3.addChild(topleft4);
        this.topleft4.cubeList.add(new ModelBox(topleft4, 78, 27, 3.0F, -0.1842F, 3.5827F, 1, 16, 1, -0.1F, false));

        this.bottomleft = new AdvancedModelRenderer(this);
        this.bottomleft.setRotationPoint(-2.5F, -13.0F, 1.5F);
        this.allarms.addChild(bottomleft);
        this.setRotateAngle(bottomleft, 0.2618F, -0.3491F, 0.0F);
        this.bottomleft.cubeList.add(new ModelBox(bottomleft, 86, 44, -0.4484F, -0.1591F, -0.4447F, 1, 8, 1, 0.0F, true));

        this.bottomleft2 = new AdvancedModelRenderer(this);
        this.bottomleft2.setRotationPoint(0.0F, 7.85F, 0.0F);
        this.bottomleft.addChild(bottomleft2);
        this.bottomleft2.cubeList.add(new ModelBox(bottomleft2, 78, 27, -0.4376F, -0.1842F, -0.4173F, 1, 16, 1, -0.1F, true));

        this.topmiddleright = new AdvancedModelRenderer(this);
        this.topmiddleright.setRotationPoint(2.7F, -13.0F, -2.6F);
        this.allarms.addChild(topmiddleright);
        this.setRotateAngle(topmiddleright, -0.0873F, 0.0F, -0.3491F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.75F, 0.0F);
        this.topmiddleright.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 53, -0.6286F, 5.6661F, -0.5001F, 1, 8, 1, 0.0F, false));

        this.topmiddleright2 = new AdvancedModelRenderer(this);
        this.topmiddleright2.setRotationPoint(0.0F, 7.9F, 0.0F);
        this.topmiddleright.addChild(topmiddleright2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -13.65F, 0.0F);
        this.topmiddleright2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 124, -0.5756F, 13.5198F, -0.4836F, 1, 16, 1, -0.1F, false));

        this.topmiddleleft = new AdvancedModelRenderer(this);
        this.topmiddleleft.setRotationPoint(-3.7F, -13.0F, -2.6F);
        this.allarms.addChild(topmiddleleft);
        this.setRotateAngle(topmiddleleft, -0.0873F, 0.0F, 0.3054F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.75F, 0.0F);
        this.topmiddleleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 91, 53, -0.3714F, 5.6661F, -0.5001F, 1, 8, 1, 0.0F, true));

        this.topmiddleleft2 = new AdvancedModelRenderer(this);
        this.topmiddleleft2.setRotationPoint(0.0F, 7.9F, 0.0F);
        this.topmiddleleft.addChild(topmiddleleft2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -13.65F, 0.0F);
        this.topmiddleleft2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 185, 124, -0.4244F, 13.5198F, -0.4836F, 1, 16, 1, -0.1F, true));

        this.bottommiddleright = new AdvancedModelRenderer(this);
        this.bottommiddleright.setRotationPoint(2.5F, -13.0F, 0.25F);
        this.allarms.addChild(bottommiddleright);
        this.setRotateAngle(bottommiddleright, 0.0873F, -0.1745F, -0.2618F);
        this.bottommiddleright.cubeList.add(new ModelBox(bottommiddleright, 88, 90, -0.1491F, -0.1209F, -0.7457F, 1, 8, 1, 0.0F, false));

        this.bottommiddleright2 = new AdvancedModelRenderer(this);
        this.bottommiddleright2.setRotationPoint(0.25F, 7.9F, -0.1F);
        this.bottommiddleright.addChild(bottommiddleright2);
        this.bottommiddleright2.cubeList.add(new ModelBox(bottommiddleright2, 82, 10, -0.363F, -0.1847F, -0.6111F, 1, 16, 1, -0.1F, false));

        this.bottommiddleleft = new AdvancedModelRenderer(this);
        this.bottommiddleleft.setRotationPoint(-3.5F, -13.0F, 0.25F);
        this.allarms.addChild(bottommiddleleft);
        this.setRotateAngle(bottommiddleleft, 0.0873F, 0.0F, 0.2618F);
        this.bottommiddleleft.cubeList.add(new ModelBox(bottommiddleleft, 88, 90, -0.8509F, -0.1209F, -0.7457F, 1, 8, 1, 0.0F, true));

        this.bottommiddleleft2 = new AdvancedModelRenderer(this);
        this.bottommiddleleft2.setRotationPoint(-0.25F, 7.9F, -0.1F);
        this.bottommiddleleft.addChild(bottommiddleleft2);
        this.bottommiddleleft2.cubeList.add(new ModelBox(bottommiddleleft2, 82, 10, -0.637F, -0.1847F, -0.6111F, 1, 16, 1, -0.1F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(-1.5F, 1.0F, 4.0F);
        this.wholething.addChild(siphon);


        this.siphon_r1 = new AdvancedModelRenderer(this);
        this.siphon_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.siphon.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.3927F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 0, 0, -1.0F, -4.6F, 0.0F, 2, 7, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-1.0F, -41.75F, -6.5F);
        this.wholething.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -94.25F, -0.5F, 11, 133, 11, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 44, 0, -5.0F, -144.25F, 1.0F, 9, 50, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 44, 58, -3.0F, -192.25F, 2.25F, 5, 48, 5, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 64, 76, -2.0F, -223.25F, 3.25F, 3, 31, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 78, 44, -1.0F, -236.25F, 4.25F, 1, 13, 1, 0.0F, false));

        this.bottomhalfshell_r1 = new AdvancedModelRenderer(this);
        this.bottomhalfshell_r1.setRotationPoint(3.5F, 40.0F, 15.5F);
        this.shell.addChild(bottomhalfshell_r1);
        this.setRotateAngle(bottomhalfshell_r1, 0.0873F, 0.0F, 0.0F);
        this.bottomhalfshell_r1.cubeList.add(new ModelBox(bottomhalfshell_r1, 76, 76, -9.0F, -8.0F, -8.0F, 10, 10, 4, 0.0F, false));

        updateDefaultPose();
        //animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.wholething.render(f5 * 0.12F);
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
        this.wholething.offsetY = 1.3F;

        AdvancedModelRenderer[] tentacle1 = {this.top, this.top2};
        AdvancedModelRenderer[] tentacle2 = {this.topright, this.topright2};
        AdvancedModelRenderer[] tentacle3 = {this.topmiddleright, this.topmiddleright2};
        AdvancedModelRenderer[] tentacle4 = {this.bottommiddleright, this.bottommiddleright2};
        AdvancedModelRenderer[] tentacle5 = {this.bottomright, this.bottomright2};
        AdvancedModelRenderer[] tentacle6 = {this.bottom, this.bottom2};
        AdvancedModelRenderer[] tentacle7 = {this.bottomleft, this.bottomleft2};
        AdvancedModelRenderer[] tentacle8 = {this.bottommiddleleft, this.bottommiddleleft2};
        AdvancedModelRenderer[] tentacle9 = {this.topmiddleleft, this.topmiddleleft2};
        AdvancedModelRenderer[] tentacle10 = {this.topleft3, this.topleft4};

        float speed = 0.09F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Upper and Lower:
        this.chainWave(tentacle1, speed, 0.27F, -1, f2, 0.7F);
        this.chainWave(tentacle6, speed, -0.3F, -1, f2, 0.8F);

        this.chainWave(tentacle2, speed, -0.3F, -1, f2, 0.8F);
        this.chainWave(tentacle10, speed, -0.3F, -1, f2, 0.8F);

        //Left - and right +:
        this.chainFlap(tentacle8, speed, -0.35F, -2, f2, 1F);
        this.chainFlap(tentacle9, speed, -0.35F, -2, f2, 1F);
        this.chainFlap(tentacle3, speed, 0.35F, -2, f2, 1F);
        this.chainFlap(tentacle4, speed, 0.35F, -2, f2, 1F);

        this.chainWave(tentacle5, speed, -0.3F, -2, f2, 1F);
        this.chainWave(tentacle7, speed, -0.3F, -2, f2, 1F);

        //Top right and left are a bit odd.....
        //this.walk(toprightarm, speed, 0.15F, false, 0F, 1, f2, 1F);
        //this.flap(toprightarm, speed, 0.3F, false, 0F, 1, f2, 1F);
        //this.flap(toprightarm2, speed, 0.3F, false, 0, 1, f2, 1f);

        //this.chainWave(tentacle10, speed, -0.3F, -2, f2, 1F);
        //this.chainSwing(tentacle10, speed, 0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(wholething, 0.1F, 2.0F, false, f2, 2);
            //this.body.offsetX = this.moveBox(speed, 1.5F, true, 2, 1.5F);
        }
        else {
            this.wholething.rotateAngleZ = (float) Math.toRadians(90);
            this.wholething.offsetY = 1.35F;
        }

    }

}
